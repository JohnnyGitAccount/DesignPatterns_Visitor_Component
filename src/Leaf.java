
public class Leaf extends Component {
    private String mName = null;

    public String getName() {
        return mName;
    }

    public Leaf(String name) {
        mName = name;
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor != null) {
            visitor.visitLeaf(this);
        }
    }
}
