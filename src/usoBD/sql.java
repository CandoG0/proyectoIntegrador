package usoBD;

/**
 *
 * @author fanma
 */
public class sql {
    //ESTA CLASE RECIBIRA COMO ARGUMENTO LA CLASE Y EL OBJETO DONDE ESTOY GUARDANDO EL NOMBRE DE USUARIO
    public static String insertlogginU(logginU Loggin){
        //DELVOLVERA EL NOMBRE DEL DEPARTAMENTO QUE SE ESTA INSERTANDO
        return "INSERT INTO loggin VALUES (NULL,"
                + "'"+ Loggin.getNickname() +"',"
                + "'"+ Loggin.getContraseña() +"',"
                + "'"+ Loggin.getCorreo() +"')";
    }
    public static String selectStsUsuarios(){
        return "SELECT * FROM stats;";
    }
}
