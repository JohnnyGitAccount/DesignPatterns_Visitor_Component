import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> mChilderComponents = new ArrayList<Component>();
    private String mName = null;

    public String getName() {
        return mName;
    }

    public Composite(String name) {
        mName = name;
    }

    public List<Component> getChildComponents() {
        return mChilderComponents;
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor == null) {
            return;
        }
        visitor.visitComposite(this);
        // childAccept(visitor);
    }

    // private void childAccept(Visitor visitor) {
    // int size = mChilderComponents.size();
    // if (size == 0) {
    // return;
    // }
    // for (int i = 0; i < size; i++) {
    // mChilderComponents.get(i).accept(visitor);
    // }
    // }

    @Override
    public void addChild(Component component) {
        if (component != null) {
            mChilderComponents.add(component);
        }
    }

    @Override
    public void removeChild(Component component) {
        if (component != null) {
            mChilderComponents.remove(component);
        }
    }

    @Override
    public Component getChilden(int index) {
        if (index < 0) {
            return null;
        }
        return mChilderComponents.get(index);
    }
}
