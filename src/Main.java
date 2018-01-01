
public class Main {

    public static void main(String[] args) {
        Composite ram = new Composite("内存");
        Composite notebookRAM = new Composite("笔记本内存");
        Leaf kingston = new Leaf("金士顿");
        Leaf corsair = new Leaf("海盗船");
        notebookRAM.addChild(kingston);
        notebookRAM.addChild(corsair);
        ram.addChild(notebookRAM);
        Composite pcRAM = new Composite("台式机内存");
        pcRAM.addChild(kingston);
        pcRAM.addChild(corsair);
        ram.addChild(pcRAM);

        PrintNameVisitor printNameVisitor = new PrintNameVisitor();
        ram.accept(printNameVisitor);
    }

}
