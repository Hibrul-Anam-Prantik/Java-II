public class ABCServer {
    private String serverName;
    private String[] name;  
    private int idxN;   // index to add hero names
    private String[] role;  
    private int idxR;   // index to add hero roles
    private int capacity; 
    private int totalMembers;
    
    public ABCServer() {
        serverName = "Default";
        capacity = 10;
        name = new String[capacity];
        role = new String[capacity];
    }

    public ABCServer(String serverName, int capacity) {
        this.serverName = serverName;
        this.capacity = capacity;
        name = new String[capacity];
        role = new String[capacity];
    }

    public void details() {
        System.out.println("Server Name: " + serverName);
        System.out.println("Member Capacity: " + capacity);
        System.out.println("Total Members: " + totalMembers);
        System.out.println("Members: ");
        for(int i = 0; i < totalMembers; i++) {
            System.out.println("Name:Role --> " + name[i] + ":" + role[i]);
        }
    }

    public void addMembers(String member) {
        if(totalMembers >= capacity) {
            System.out.println("Sorry, maximum capacity exceeded!");
        } else {
            name[idxN++] = member;
            role[idxR++] = "Rising Hero";
            totalMembers ++;
            System.out.println(role[0] + "  is added.");
        }
    }

    public void addMembers(String member, String role) {
        if(totalMembers >= capacity) {
            System.out.println("Sorry, maximum capacity exceeded!");
        } else {
            name[idxN++] = member;
            this.role[idxR++] = role;
            totalMembers ++;
            System.out.println(role + "  is added.");
        }
    }    
}
