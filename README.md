# JAVA Art Gallery System- GUI - Bugra Ates
 Java art gallery system codes and report included in this repository.
 This program was written with java design patterns.
 ## -- Buğra ATEŞ -- 

Art Gallery Design Document v.1.0

# JAVA ART GALLERY SYSTEM REPORT
## 20.12.2019
# Author: Buğra ATEŞ

Contents

_1__Introduction **[6]

**1.1**** Purpose [6]

**1.2**** System Overview [6]

**1.3**** Design Objectives [6]

**1.4**** References [6]

**1.5**** Definitions, Acronyms, and Abbreviations [6]

_ **2** __**Design Overview [7]

**2.1**** Introduction [7]

**2.2**** Environment Overview [7]

**2.3**** System Architecture [7]

2.3.1Art-Gallery System[7]

**2.4**** Constraints and Assumptions [8]

_ **3** __**Interfaces and Data Stores [9]

**3.1**** System Interfaces [9]

3.1.1Art-Gallery System[9]

**3.2**** Data Stores [9]

_ **4** __ **Structural Design 10** _

**4.1**** Design Discussion and Rationale……………………………………………...10**

**4.2**** Class Diagram……………………………………………………………………...11**

**4.2**** Class Descriptions [1]

**4.3**** Classes in the Fuel Subsystem [1]

4.3.1Class: Tank [1]

_ **5** __**Dynamic Model [1]

**5.1**** Scenarios [1]

6 **Supplementary Documentation _[1]

# 1Introduction

We took &quot;Sale and Record the Paintings&quot; problem, and try to make an application to solve this issue.

## 1.1Purpose

This project helps people who are employees or workers to manage the art gallery and makes to do functions easily.

## 1.2System Overview

The technologies that we use in this project are mainly Java as a software language and a computer as a hardware and database part. These technologies can be changed, or new technologies can be added for the goal of application.

## 1.3Design Objectives

The design of the application is simplified by authors. Main page which means the paintings showroom is simple because customer has to be clear minded. The other pages are more complicated but still simple to understand how it works.

## 1.4References

Provide references to other documents.

_Hint_: You must at least refer to the requirements document!

## 1.5Definitions, Acronyms, and Abbreviations

_We didn&#39;t use any acronyms or abbreviations so we don&#39;t have any definitions._

# 2Design Overview

## 2.1Introduction

## While we designing and coding the project, we adopted and based on Object-Oriented design and used other relevant techniques and tools like website(draw.io) and Netbeans.

## 2.2Environment Overview

_This project is a computer-based application. Even for the database we used computer as a database._

## 2.3System Architecture

_Provide a high-level description of the system architecture __. Use a few block diagrams_ _to show the major components and their interaction__. Remember to describe the conventions and notations used in your diagrams._

_ **The following is provided as an example:** _

### 2.3.1Art-Gallery System

_The Art-Gallery system consists of the Employee interface and Painting Interface. The Employee interface in turn consists of Saving Operations and Database._

## 2.4Constraints and Assumptions

We focused ona a good design with some simple functions. Still we had constrain.

1. _Our main constraint is time because we tried to make a good design so that took time and developing the app became a bit harder._

# 3Interfaces and Data Stores

This section describes the interfaces into and out of the system as well as the data stores you will be including in your system.

## 3.1System Interfaces

_The various interfaces_ _provided to users and/or other external systems should be defined here. If you had included user interface_ _descriptions in your requirements document you may refer to them here. If you provide interfaces to other systems, say export and import data to a different software, you should mention them here._

_Do not include JavaDocs here. You should describe the interfaces using prose and graphics if your interface includes a GUI._

### 3.1.1Painting Interface

_This interface is used to hold the painting on the screen, when user clicks on painting, informations about painting appears on a pop-up table. On the table there are informations like Artist Name, Painting&#39;s Year. But also there is another button which opens another table about paintings history. And also if user wants to save a order, he can use another button to open that page._

Employee Interface

_This interface has blanks to fill the informations about order which are painting and customer informations. From this interface we can save, delete, update informations and also we can open the database page._

## 3.2Data Stores

_We stored the data in the app itself but also we created a database which is txt file if user wants the save the info permanently._

# 4Structural Design

## 4.1Class Diagram

##


## 4.2Class Descriptions

- **ArtGalleryMain class is our main class and has an user interface. It contains different buttons for executing different GUIs. Also contains many event functions. It derives some objects from other classes in inside it for making some processes.**

**It has singleton pattern for creating object to set other GUI visible. The paintings that in this class has some different informations thanks to using Flyweight pattern.**

- **AdminLoginGUI is a GUI class. It is connected with AdminPanel which is our GUI class has some blanks to taking inputs from users. AdminLoginGUI class checks the correctness between username and password for signing.**

- **AdminPanel is a GUI class. It contains many selectable boxes and fillable blanks. It takes some inputs and with those inputs admin can save to database , delete or update. In back of the gui , this class has some file operations with builder pattern.**

- **ArdDataGUI is a GUI class (JDıalog Form). Reads the saved informations from the data. And has a blank for doing dynamic searchs in taken data.**

- **ArtInfosGUI is a GUI class. This class is accessible in the main class. Main GUI has some different paintings . And each painting has an event. These events are providing to execute ArtInfosGUI class.**

- **ArtStoryGUI is a GUI class. It is accessed thanks to button in ArtInfosGUI. It takes different stories for each paintings. With using builder pattern.**

- **Arts is a class that contains painting&#39;s informations. Setter and getter functions are providing to reach necessary informations.**

- **Infos is class that is held the user informations by builder pattern class. By using this class , a table for infos that is included in AdminPanel class can fill.**

- **SingleGUIObject is a class that includes some functions which are returns Object types. It provides to create objects in other classes for setting GUIs visible.**

- **DefineArtInfos is a class that determines the informations for each paintings. It has some certain strings in source code and it takes some strings from the saved files which are stories. Also this class is used by some other classes. Because in the beginning , which table that the user clicked has to determine the certain informations.**

## 4.3Method Descriptions

####

1. Method: _defineArtInfos(String artType)_

Return Type: _void_

Parameters:_artType – for the determine the informations_

Return value: _nothing just does the process_

Methods called: _readStory(String fileName,Arts arts)_

Processing logic:

We send an artType string next to each object in hashmap and according to artType we determine their informations.

_2._ Method: _ArtClickFunction(String artType)_

Return Type: _void_

Parameters:_artType – for the determine the informations_

_artName,Artist,Price - for setting the necessary informations after determined_

Return value: _nothing just does the process_

Methods called: _art\_info.setInformations (arts.getArtName(),arts.getArtist(),arts.getPrice())_

_define\_art.defineArtInfos(artType)_

Processing logic:

Takes the artType and calls the defineArtInfos function. Thanks to that , this function provides to determine informations for each artType. After the determining process , it sets the informations with the setInformations function.

_3._ Method: _setArtType(String artType)_

Return Type: _void_

Parameters:_artType – taking the artType for giving the right informations_

Return value: _nothing just does the process_

Methods called: _none_

Processing logic:

It takes the artType and synchronizes the static string variable in ArtInfosGUI.

_4._ Method: _setInformations (String artName,String artistName,String price)_

Return Type: _void_

Parameters:_artName,Artist,Price_

Return value: _nothing just does the process_

Methods called: _none_

Processing logic:

This function sets the given informations to the blanks in GUI.

_5._ Method: _story\_buttonMouseClicked (java.awt.event.MouseEvent evt)_

Return Type: _void_

Parameters: artType – _This parameter uses in function._

_._

Return value: _nothing just does the process_

Methods called: _story\_gui.getStory(artType) ,setVisible(true)_

Processing logic:

When some click event occurred it uses right artType and executes the getStory() function.

And it makes the ArtStoryGUI visible.

_6._ Method: _getStory (String artType)_

Return Type: _void_

Parameters:_artType – For sending the class (created with using flyweight pattern)_

Return value: _nothing just does the process_

Methods called: _ArtFactory.getArt(artType) , setText(arts.getStory())_

Processing logic:

After taking the artType it uses ArtFactory class and its static getArt(artType) function. In this way the informations that are next to artType in hashmap are taken. So after that it can determine the story with using arts.getStory() function. (setting the story field with getStory())

# 5Dynamic Model

_The purpose of this section is to model how the system responds to various events, i.e., model the system&#39;s behavior __. We do this using UML sequence diagrams__._

_The first step is to identify different scenarios_ _(e.g. Fuel Level Overshoots), making sure you address each use case in your requirements document. Do not invent scenarios, rather a general guideline is to include scenarios that would make sense to the customer.__For example, for the course enrollment system, logging in is a valid scenario._

## 5.1Scenarios

_For each scenario you will have a subsection with the following information:_

- _Scenario Name: Saving the informations to the database._
- _Scenario Description: We are going to take the informations from user and save it to the database._
- _Sequence Diagram:_

![alt text](https://ibb.co/9hcTJRq)

# 6Supplementary Documentation

**Sources to understand the patterns and the logic**

- **[www.tutorialspoint.com](http://www.tutorialspoint.com/)**

- **Java Program Design Principles, Polymorphism, and Patterns by Edward Sciore**

- **Head First Design Patterns a Brain-Friendly Guide by Eric Freeman &amp; Elisabeth**

![](RackMultipart20210121-4-1npvcni_html_216e88414c3a9363.gif)
