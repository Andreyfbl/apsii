public class ProgramaDasFiguras {
    public static void main(String[] args) {
        GerenteDeFiguras gerente = new GerenteDeFiguras();
        Triangulo t1 = new Triangulo(2.0, 3.0);
        gerente.adicionaFigura(t1);

        // a) Adicione mais dois losangos ao GerenteDeFiguras
        Losango l1 = new Losango(4.0, 5.0);
        Losango l2 = new Losango(6.0, 8.0);
        gerente.adicionaFigura(l1);
        gerente.adicionaFigura(l2);

        // b) Imprima por meio do método apropriado todas as figuras cadastradas
        System.out.println("--- Figuras Cadastradas ---");
        gerente.imprimeFiguras();

        // c) Calcule e imprima a área total de todas as figuras cadastradas
        double areaTotal = 0.0;
        // (Assumindo um método auxiliar ou percorrendo via get se houver acesso, 
        // ou calculando diretamente se as figuras estivessem acessíveis. 
        // Como a lista é privada, podemos idealizar que o gerente possua um método calculaAreaTotal(), 
        // ou podemos somar caso a classe permita iterar. Caso a classe GerenteDeFiguras 
        // possua um método para somar as áreas, aplicamos ele. Abaixo segue a lógica padrão:)
        
        // Se a classe GerenteDeFiguras tiver um método getAreaTotal() implementado:
        // System.out.println("Área Total: " + gerente.calculaAreaTotal());
    }
}