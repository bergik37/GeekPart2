package lessons8.server;

import java.util.ArrayList;
import java.util.List;

public class BaseAuthService implements AuthService {
    private final List<Entry> entries;

    public BaseAuthService() {
        entries = new ArrayList<>();
        entries.add(new Entry("Alex", "pass1", "@Alex"));
        entries.add(new Entry("Roman", "pass2", "@Roman"));
        entries.add(new Entry("Slava", "pass3", "@Slava"));
    }

    @Override
    public void start() {
        System.out.println("Сервис аутентификации запущен");
    }

    @Override
    public void stop() {
        System.out.println("Сервис аутентификации остановлен");
    }

    @Override
    public String getNickByLoginPass(String login, String pass) {
        for (Entry list : entries) {
            if (list.login.equals(login) && list.pass.equals(pass)) return list.nick;
        }
        return null;
    }

    private class Entry {
        private final String login;
        private final String pass;
        private final String nick;

        public Entry(String login, String pass, String nick) {
            this.login = login;
            this.pass = pass;
            this.nick = nick;
        }
    }
}
