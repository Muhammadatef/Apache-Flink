# Apache Flink WordCount Project

This project demonstrates a basic **WordCount** example using Apache Flink in Java. It filters input data to include only lines starting with a specific letter (in this case, 'N') and counts the occurrences of each word.

## Prerequisites

- **Java 8** or higher
- **Apache Maven** 3.6.0 or higher
- **IntelliJ IDEA** (or any IDE with Maven support)
- **Apache Flink** dependencies

## Project Structure

- **Main Class**: `WordCount`
- **Package**: `p1`
- **Dependencies**: Defined in `pom.xml`

## Setting Up the Project

1. Clone the repository or download the source code.

2. Open IntelliJ IDEA and select **File > Open**, then navigate to the root folder of the project.

3. In IntelliJ, ensure that Maven is set up by confirming that the **Maven Tool Window** is visible on the right sidebar. If not, you can activate it through **View > Tool Windows > Maven**.

4. Import dependencies by reloading the Maven project:
   - Right-click the `pom.xml` file and select **Reload Project**.

### pom.xml Configuration

Add the following dependencies to your `pom.xml` file if they are not already present:

```xml
<dependencies>
    <dependency>
        <groupId>org.apache.flink</groupId>
        <artifactId>flink-java</artifactId>
        <version>1.15.0</version>
    </dependency>
    <dependency>
        <groupId>org.apache.flink</groupId>
        <artifactId>flink-clients</artifactId>
        <version>1.15.0</version>
    </dependency>
</dependencies>
```

## Building the Project

Open a terminal and navigate to the project directory. Then, run:
```bash
mvn clean package

```

This will create an executable JAR file in the target directory.


## Running the Project
The WordCount program expects two arguments:

input: Path to the input text file
output: Path where the output CSV file will be saved


To run the JAR file, use the following command:
```bash

java -jar target/your-project-name-1.0-SNAPSHOT.jar --input path/to/input.txt --output path/to/output.csv
```

Example:
```bash
java -jar target/flink-wordcount-1.0-SNAPSHOT.jar --input /path/to/input.txt --output /path/to/output.csv
```

## Running in IntelliJ

Go to Run > Edit Configurations
Create a new Application configuration
Set the main class to p1.WordCount
Add program arguments:
   --input /path/to/input.txt --output /path/to/output.csv



## Code Explanation
The program reads a text file, filters lines that start with "N", tokenizes each line into (word, 1) pairs, and counts occurrences for each unique word. Results are written to a CSV file specified by the output parameter.
Main Components

ExecutionEnvironment: The context in which the program is executed
ParameterTool: Used to handle input and output parameters
FilterFunction: Filters lines starting with "N"
MapFunction (Tokenizer): Tokenizes each line into (word, 1) pairs
GroupBy and Sum: Groups by word and sums up counts

### Sample Input and Output:

Sample Input
Nashville
New York
Los Angeles
New Jersey
Nairobi
Dallas

Sample Output
Nashville,1
New York,1
New Jersey,1
Nairobi,1


## Monitoring Jobs in Flink Dashboard

### Starting the Flink Dashboard

1. Start the local Flink cluster:
```bash
./bin/start-cluster.sh
```
Access the Flink Web Dashboard:

Open your browser and navigate to http://localhost:8081
This opens the Flink Web UI, where you can monitor your jobs



## Dashboard Features

Overview: Shows cluster and job status at a glance
Running Jobs: Lists all currently executing jobs
Completed Jobs: History of finished jobs
Task Managers: Shows the status of all task managers
Job Manager: Provides detailed metrics about the Job Manager

## Monitoring Your WordCount Job

After starting your job, you'll see it appear in the "Running Jobs" section
Click on the job to see detailed information:

Job Overview: General status and runtime metrics
Metrics: Performance data and throughput
Timeline: Visual representation of job execution
Checkpoints: Information about savepoints and checkpoints
Configuration: Job and task-specific settings



## Job Visualization
The dashboard provides a visual representation of your WordCount pipeline:
![Flink WordCount Job Graph](images/Screenshot%20from%202024-11-02%2017-06-44.png)


## Troubleshooting

If you encounter build errors:

Ensure Maven is properly installed
Check that all dependencies are correctly defined in pom.xml
Try running mvn clean install to rebuild the project


If you get runtime errors:

Verify that input file exists and is readable
Ensure output directory is writable
Check program arguments are correctly formatted



## Contributing

Fork the repository
Create your feature branch (git checkout -b feature/AmazingFeature)
Commit your changes (git commit -m 'Add some AmazingFeature')
Push to the branch (git push origin feature/AmazingFeature)
Open a Pull Request

## License
This project is licensed under the MIT License.
