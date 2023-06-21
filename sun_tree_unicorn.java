1. import java.util.Objects;

2. public class CommunityRenewal {

3. 	//Declare fields
4. 	private String organizationName;
5. 	private String missionStatement;
6. 	private ArrayList<Project> projects;

7. 	//Constructors
8. 	public CommunityRenewal() {
9. 		this.organizationName = "";
10. 		this.missionStatement = "";
11. 		this.projects = new ArrayList<Project>();
12. 	}

13. 	public CommunityRenewal(String organizationName, String missionStatement, ArrayList<Project> projects) {
14. 		this.organizationName = organizationName;
15. 		this.missionStatement = missionStatement;
16. 		this.projects = projects;
17. 	}

18. 	//Getters and setters
19. 	public String getOrganizationName() {
20. 		return organizationName;
21. 	}

22. 	public void setOrganizationName(String organizationName) {
23. 		this.organizationName = organizationName;
24. 	}

25. 	public String getMissionStatement() {
26. 		return missionStatement;
27. 	}

28. 	public void setMissionStatement(String missionStatement) {
29. 		this.missionStatement = missionStatement;
30. 	}

31. 	public ArrayList<Project> getProjects() {
32. 		return projects;
33. 	}

34. 	public void setProjects(ArrayList<Project> projects) {
35. 		this.projects = projects;
36. 	}

37. 	//Instance methods
38. 	public void addProject(Project project) {
39. 		this.projects.add(project);
40. 	}

41. 	public void removeProject(Project project) {
42. 		this.projects.remove(project);
43. 	}

44. 	public void printProjectList() {
45. 		System.out.println("Projects for " + this.organizationName + ":");
46. 		for (Project project : this.projects) {
47. 			System.out.println(project.toString());
48. 		}
49. 	}

50. 	@Override
51. 	public boolean equals(Object o) {
52. 		if (this == o) return true;
53. 		if (o == null || getClass() != o.getClass()) return false;
54. 		CommunityRenewal that = (CommunityRenewal) o;
55. 		return Objects.equals(organizationName, that.organizationName) &&
56. 				Objects.equals(missionStatement, that.missionStatement) &&
57. 				Objects.equals(projects, that.projects);
58. 	}

59. 	@Override
60. 	public int hashCode() {
61. 		return Objects.hash(organizationName, missionStatement, projects);
62. 	}

63. 	@Override
64. 	public String toString() {
65. 		return "CommunityRenewal{" +
66. 				"organizationName='" + organizationName + '\'' +
67. 				", missionStatement='" + missionStatement + '\'' +
68. 				", projects=" + projects +
69. 				'}';
70. 	}
71. }

72. class Project {
73. 	private String name;
74. 	private String description;

75. 	public Project(String name, String description) {
76. 		this.name = name;
77. 		this.description = description;
78. 	}

79. 	public String getName() {
80. 		return name;
81. 	}

82. 	public void setName(String name) {
83. 		this.name = name;
84. 	}

85. 	public String getDescription() {
86. 		return description;
87. 	}

88. 	public void setDescription(String description) {
89. 		this.description = description;
90. 	}

91. 	@Override
92. 	public boolean equals(Object o) {
93. 		if (this == o) return true;
94. 		if (o == null || getClass() != o.getClass()) return false;
95. 		Project project = (Project) o;
96. 		return Objects.equals(name, project.name) &&
97. 				Objects.equals(description, project.description);
98. 	}

99. 	@Override
100. 	public int hashCode() {
101. 		return Objects.hash(name, description);
102. 	}

103. 	@Override
104. 	public String toString() {
105. 		return "Project{" +
106. 				"name='" + name + '\'' +
107. 				", description='" + description + '\'' +
108. 				'}';
109. 	}
110. }