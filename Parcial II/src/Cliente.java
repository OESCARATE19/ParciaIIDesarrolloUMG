@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private INT idcliente;
    private varchar primernombre;
    private varchar segundonombre;
    private varchar otronombre;
    private varchar primerapellido;
    private varchar segundoapellido;
    private varchar otroapellido;
    private varchar genero;
    private date fechadenacimiento;
    private varchar segmento;
    private decimal sueldo;
    private varchar dpi;
    private varchar correo;
    private varchar telefono;
    private varchar direccion;
    private timestamp fechacreacion;

    // Getters y setters
}
