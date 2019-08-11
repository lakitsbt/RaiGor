package entites;

public class Dept {
	private int deptno;
	private String dname;
	private String db_source;
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDb_source() {
		return db_source;
	}
	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}

	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", db_source="
				+ db_source + "]";
	}
	
	
	
	public Dept() {
		super();
		
	}
	public Dept(int deptno, String dname, String db_source) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.db_source = db_source;
	}
	
	
}
