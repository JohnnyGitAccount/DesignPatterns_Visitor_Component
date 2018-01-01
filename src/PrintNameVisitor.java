import java.util.List;

public class PrintNameVisitor implements Visitor {

    private StringBuilder mSbrPreStr = new StringBuilder();

    @Override
    public void visitComposite(Composite composite) {
        if (composite == null) {
            return;
        }
        System.out.println(mSbrPreStr + "+" + composite.getName());
        printChildName(composite.getChildComponents());
    }

    private void printChildName(List<Component> childComponents) {
        if (childComponents == null) {
            return;
        }
        int size = childComponents.size();
        if (size == 0) {
            return;
        }
        mSbrPreStr.append(" ");
        for (int i = 0; i < size; i++) {
            childComponents.get(i).accept(this);
        }
        mSbrPreStr.deleteCharAt(mSbrPreStr.length() - 1);
    }

    @Override
    public void visitLeaf(Leaf leaf) {
        if (leaf == null) {
            return;
        }
        System.out.println(mSbrPreStr + "-" + leaf.getName());
    }

}
