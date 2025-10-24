import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraCinemaTest {
    
    @Test
    public void testCalcularTotalVenda_CasoNormal() {
        // Teste caso normal
        assertEquals(50.0, CalculadoraCinema.calcularTotalVenda(2, 25.0), 0.001);
        
        // Teste com valores decimais
        assertEquals(37.5, CalculadoraCinema.calcularTotalVenda(3, 12.5), 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalcularTotalVenda_QuantidadeInvalida() {
        // NO JUNIT 4 FUNCIONA o parâmetro 'expected'!
        CalculadoraCinema.calcularTotalVenda(0, 25.0);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalcularTotalVenda_PrecoInvalido() {
        // NO JUNIT 4 FUNCIONA o parâmetro 'expected'!
        CalculadoraCinema.calcularTotalVenda(2, -10.0);
    }
    
    @Test
    public void testCalcularPrecoComDescontoEstudante() {
        assertEquals(12.5, CalculadoraCinema.calcularPrecoComDescontoEstudante(25.0), 0.001);
        assertEquals(50.0, CalculadoraCinema.calcularPrecoComDescontoEstudante(100.0), 0.001);
    }
    
    @Test
    public void testCalcularPrecoComDescontoIdoso() {
        assertEquals(17.5, CalculadoraCinema.calcularPrecoComDescontoIdoso(25.0), 0.001);
        assertEquals(70.0, CalculadoraCinema.calcularPrecoComDescontoIdoso(100.0), 0.001);
    }
    
    @Test
    public void testValidarFormatoHorario() {
        // Testes de horários válidos
        assertTrue("14:30 deve ser válido", CalculadoraCinema.validarFormatoHorario("14:30"));
        assertTrue("09:15 deve ser válido", CalculadoraCinema.validarFormatoHorario("09:15"));
        assertTrue("23:59 deve ser válido", CalculadoraCinema.validarFormatoHorario("23:59"));
        
        // Testes de horários inválidos
        assertFalse("24:00 deve ser inválido", CalculadoraCinema.validarFormatoHorario("24:00"));
        assertFalse("14:60 deve ser inválido", CalculadoraCinema.validarFormatoHorario("14:60"));
        assertFalse("14:30:00 deve ser inválido", CalculadoraCinema.validarFormatoHorario("14:30:00"));
        assertFalse("String vazia deve ser inválida", CalculadoraCinema.validarFormatoHorario(""));
        assertFalse("Null deve ser inválido", CalculadoraCinema.validarFormatoHorario(null));
    }
    
    @Test
    public void testCalcularMediaAvaliacao() {
        double[] avaliacoes = {4.5, 3.0, 5.0, 2.5};
        assertEquals(3.75, CalculadoraCinema.calcularMediaAvaliacao(avaliacoes), 0.001);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalcularMediaAvaliacao_ArrayVazio() {
        double[] avaliacoes = {};
        CalculadoraCinema.calcularMediaAvaliacao(avaliacoes);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testCalcularMediaAvaliacao_NotaInvalida() {
        double[] avaliacoes = {4.5, 6.0}; // 6.0 é inválido
        CalculadoraCinema.calcularMediaAvaliacao(avaliacoes);
    }
    
    @Test
    public void testBasico() {
        assertTrue("Teste básico deve passar", true);
    }
}