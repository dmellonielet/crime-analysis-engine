Crime Analysis Engine(CMPE 272 Project) (Project Team 1)
=========================================================


-------------------------
Crime Analysis Engine
-------------------------   

Short Description
------------------
Everyday when we travel to places, how often do we know the area around us? Safety is a major concern for everyone. Hence, we need an engine that will aid us to understand how safe a particular area is at any given time. Our Crime Analysis engine provides analysis, visualization and information of the criminal data related to the crimes happening in the area. It will allow the user to see crime hotspots, isolate crimes by type, and identify the days when a particular crime occurs as well as the time.




Introduction
------------
Education is the best defense against crime. Hence, we provide the crime analysis engine to provide an analysis about the neighborhood of our interest.
Crime Analysis Engine is a mobile application aimed towards providing a tool to check the safety for any area. The primary goal of the application is to provide relevant and accurate statistical analysis of the crime in any particular area. We have done graphical representations and provided a crime map to highlight the crimes occurring in the area of interest. We have analyzed the data and provided a graphical representation about the crime types, frequency of occurrence, etc. Public can analyze a particular neighborhood to know the crime rate can use the application.
This paper aims at giving you a detailed description of our work along with various functionalities implemented in this application.  

Analysis

We have been through various websites and applications doing crime analysis and generating crime map. However, they do not cater to all requirements. Also, many of those miss a graphical representation. When seen from an end user point, these sites and applications are not so easy to use. Also, the data used by them is irrelevant and unstructured. Hence, we decided to analyze the crime data of various top cities in the United States and develop a mobile application which will be have graphical representation of the data along with a crime map to depict the crime in the area entered by the user. We have provided statistical analysis of the data in following categories:

A. Overall Area Safety
We gathered data from various government databases and other websites, which provide datasets about crimes in various cities of the United states. We transformed the unstructured data to a structured format. We then represent it graphically to show the overall rating of the area.

B. Crime By Day
Using the data used in A, we have represented the crime by each day of the week for a particular area. Consider a city, which has more crimes happening on weekends than weekdays. Hence, filter it and display it by day.


C. Most Crime
A particular crime may be prominent in any selected area. Hence, we filter it to display which crime occurs the most in any particular selected area. Using graphs, we display it to the user.

D. Most Unsafe Time
The area entered by the user might be safe or unsafe at any particular time. For example, area X is not safe after 10 pm since many crimes occur at that time. Thus, we display the most average of the most unsafe time for the selected area. 

E. Most Unsafe Day
The area the user wants to know might be safe or unsafe at any particular day. For example, area X has lower safety on Saturdays since many crimes occur at that time. Thus, we display the most unsafe day for the selected area. 

F. Crime By Time
In order to make the application even detailed for the user, we further filter the data and provide the crime occurrence by type in a graphical format. Thus, the user can view which crime has occurred the most by a particular time in this section. 

G. Crime By Day
Extending the filter, we display the occurrence of crime according to the days of the weeks. This will provide the user with a day wise analysis on the crime data.

H. Crime By Type
We display the crimes by type for a particular area, which the user has inserted. Thus, the user can view the occurrence of crime by its type.



Technology Used
----------------
J2EE
Jersey REST Framework
Jackson Framework
Mysql
HTML5
Jquery
CSSS
Apache Cordova
