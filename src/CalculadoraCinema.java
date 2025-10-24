public class CalculadoraCinema {
    
    public static double calcularTotalVenda(int quantidade, double precoUnitario) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade deve ser maior que zero");
        }
        if (precoUnitario <= 0) {
            throw new IllegalArgumentException("Preço unitário deve ser maior que zero");
        }
        return quantidade * precoUnitario;
    }
    
    public static double calcularPrecoComDescontoEstudante(double precoOriginal) {
        if (precoOriginal <= 0) {
            throw new IllegalArgumentException("Preço original deve ser maior que zero");
        }
        return precoOriginal * 0.5;
    }
    
    public static double calcularPrecoComDescontoIdoso(double precoOriginal) {
        if (precoOriginal <= 0) {
            throw new IllegalArgumentException("Preço original deve ser maior que zero");
        }
        return precoOriginal * 0.7;
    }
    
    public static boolean validarFormatoHorario(String horario) {
        if (horario == null || horario.trim().isEmpty()) {
            return false;
        }
        return horario.matches("^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$");
    }
    
    public static double calcularMediaAvaliacao(double[] avaliacoes) {
        if (avaliacoes == null || avaliacoes.length == 0) {
            throw new IllegalArgumentException("Array de avaliações não pode ser vazio");
        }
        
        double soma = 0;
        for (double nota : avaliacoes) {
            if (nota < 0 || nota > 5) {
                throw new IllegalArgumentException("Avaliação deve estar entre 0 e 5");
            }
            soma += nota;
        }
        return soma / avaliacoes.length;
    }
}