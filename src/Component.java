
public abstract class Component {
    public abstract void accept(Visitor visitor);

    public void addChild(Component component) {
        throw new UnsupportedOperationException("对象没有添加子节点功能");
    }

    public void removeChild(Component component) {
        throw new UnsupportedOperationException("对象没有删除子节点功能");
    }

    public Component getChilden(int index) {
        throw new UnsupportedOperationException("对象没有获取子节点功能");
    }
}
