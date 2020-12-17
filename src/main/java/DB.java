import org.sql2o.Sql2o;

public class DB {
   //public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/organization_api", "moringa", "Emmanuel1738");
String connectionString = "jdbc:postgresql://ec2-75-101-212-64.compute-1.amazonaws.com:5432/d3pghouno47h3q"; //!
   Sql2o sql2o = new Sql2o(connectionString, "kqoqeoypholhdy", "0d543b4afb253a93648b15459937d24877fdd67d2665599c9d44a6ee84a0ab51"); //!
}
