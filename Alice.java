public class Alice {
    private String status;
    private String costume;

    public Alice(String status, String costume){
        this.status = status;
        this.costume = costume;
    }

    String getStatus(){
        return this.status;
    }

    void setStatus(String status){
        this.status = status;
    }

    String getCostume(){
        return this.costume;
    }

    void setCostume(String costume){
        this.costume = costume;
    }
}
