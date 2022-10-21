package dev.graham.smoketests;

public class ConnectionTests {
    public ConnectionTests() {
    }

    @Test
    void connection_available() throws SQLException {
        Connection connection = ConnectionFactory.getConnection();
        System.out.println(connection);
        Assertions.assertNotNull(connection);
    }

}
