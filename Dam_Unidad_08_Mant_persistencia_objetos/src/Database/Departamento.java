package Database;

public class Departamento {
    private Integer deptno;
    private String dnombre;
    private String loc;
    
    public Departamento(){
        this.deptno = null;
        this.dnombre = null;
        this.loc = null;
    }
    
    public Departamento(Integer deptno, String dnombre, String loc){
        this.deptno = deptno;
        this.dnombre = dnombre;
        this.loc = loc;
    }
    
    public void setDeptno(Integer deptno){
        this.deptno = deptno;
    }
    public Integer getDeptno(){
        return this.deptno;
    }
    
    public void setDnombre(String dnombre){
        this.dnombre = dnombre;
    }
    public String getDnombre(){
        return this.dnombre;
    }
    
    public void setLoc(String loc){
        this.loc = loc;
    }
    public String getLoc(){
        return this.loc;
    }
}


