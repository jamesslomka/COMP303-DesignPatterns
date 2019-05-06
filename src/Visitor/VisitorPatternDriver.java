package Visitor;

public class VisitorPatternDriver {

    public static void main (String[] args){
        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
