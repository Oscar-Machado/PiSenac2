import dao.JdbcUsuarioDAO;
import service.UsuarioService;
import model.Usuario;

public class Main {
    public static void main(String[] args) {
        // Replace with your DB settings
        String url = "jdbc:mysql://localhost:3306/casacultural";
        String user = "root";
        String pass = "password";

        JdbcUsuarioDAO dao = new JdbcUsuarioDAO(url, user, pass);
        UsuarioService service = new UsuarioService(dao);

        // quick smoke test in main()
        try {
            Usuario u = service.criarUsuario("Test User", "test@example.com");
            System.out.println("Criado: " + u);
            service.remover(u.getId());
            System.out.println("Removido: " + u.getId());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
