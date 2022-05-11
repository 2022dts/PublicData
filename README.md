# The dataset

This repo holds all data for our under-reviewing ASE work. By testing on the **accuracy (RQ1)**, **consistency (RQ2)** and **efficiency (RQ3)**, we had a comprehensive assessment among four dependency extraction tools we selected.

## Global identifiers

These identifiers will substitute the specific language or tool name hereinafter.

* `lang` may refers to one of the `cpp` for C++, `java` for Java and `python` for Python;

* `tool` may refers to one of the `depends` for Depends, `enre` for ENRE, `st` for SourceTrail and `und` for Understand.

## The structure of this repo

Data for its only research question are separated in standalone directories.

### `RQ1`

`RQ1` contains the benchmark files and the extracted statistics:

#### `RQ1/Benchmarks/<lang>`

This pattern of directories will contain two sub-directories `entity` and `dependency` for entity benchmarks and dependency benchmarks respectively.

#### `RQ1/Results/<lang>.csv`

This pattern of CSV files will first list the result for every kinds of entity and dependency on the tools in each row, and a row may followed by strings indicating the error level. After that a block of statistics shows the accuracy on entity,  dependency and total.

> Please note that the extracted code files are not listed since they are identical to when they were in benchmark files, and the script to do the extraction is not provided.

### `RQ2`

`RQ2` contains the comparison results for tool pairs on targeting languages respectively.

> Please note that data for RQ2 is extremely large and thus been hosted on an external online drive [here](https://1drv.ms/u/s!ArRpq5VLlwvAgicSp-1BGlHjwmDZ?e=vV2V7d). This repo only contains a pruned sample of data.

#### `RQ2/Raw/<project>/<tool>_<project>_<entity/dependency>.json`

This pattern of JSON files are the raw output of tools analysing on the targeted project (denoted as `<project>`), where each JSON item is an entity / dependency with name, type and etc.

#### `RQ2/Results/<project>/<entity/dependency>_<toolA>_<toolB>.json`

This pattern of JSON files are the consistency comparison results against `toolA` and `toolB`, where each JSON contains two top-level keys `eq_set` (means items inside are equal between the two tools) and `ne_set` (means items inside are NOT equal between the two tools).

For each item inside the `eq_set`, entities or dependencies can be found inside two keys `lgroup` and `rgroup`, where each group is an array containing one (or multiple) entity or dependency for this specific equal pair. Whereas in `ne_set`, entities or dependencies from different tools are stored as a mixed array.

### `RQ3`

`RQ3` contains the project lists that directly retrieved from the GitHub API and the corresponding statistics files:

#### `RQ3/Lists/<lang>.csv`

This pattern of CSV files is the project list for a specific language.

#### `RQ3/Results/<lang>.csv`

This pattern of CSV files is the corresponding statistic, where columns represents `LoC`, `<tool>-time` and `<tool>-memory`.

> Please note that for SourceTrail, some of the rows may lack the data (representing as 0), and only ~40 projects are filled with data since it requires manually create the proejct through the GUI, which limits the quantity of testing subjects.

> A cell with content as -1 or 0 represents a timeout (the execution time has exceeded 10 minutes).
