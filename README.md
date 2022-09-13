# The dataset

This repo holds all data for our under-reviewing ICSE work. By testing on the **accuracy (RQ2)**, **consistency (RQ3)** and **efficiency (RQ4)**, we had a comprehensive assessment among four static code dependency analyzers (i.e. Depends, ENRE, SourceTrail, and Understand) we selected.

> **Capability (RQ1)** were evaluated empirically by manual test and document searching, thus has no public data available, but **RQ2** reflects this quantitively and more precisely.

## Common identifiers

These identifiers will substitute the specific language or analyzer name hereinafter.

* `lang` may refers to one of the `cpp` for C++, `java` for Java, `python` for Python, and `ts` for JavaScript/TypeScript;

* `tool` may refers to one of the `depends` for Depends, `enre` for ENRE, `st` for SourceTrail and `und` for Understand.

## The structure of this repo

Data for corresponding research question are separated in standalone directories.

### `RQ2`

`RQ2` contains the benchmark files:

#### `RQ2/<lang>/docs`

This pattern of directories will contain two sub-directories `entity` and `relation` (alias for `dependency`) for entity benchmarks and dependency benchmarks respectively.

#### `RQ2/<lang>/tests/<tool>/<group-name>/<case-name>/*`

Files (mostly `.json` files) under this pattern of directories are output results of analyzers on correlated benchmark code, where `group-name` corresponds to a benchmark file, and `case-name` corresponds to a test case within its parent group.

> Please note that the extracted code files are not listed since they are identical to when they were in benchmark files, and the script to do the extraction is not provided.

#### `RQ2/cross-tester.js`

This is the compressed (to hide identity info to respect the double anony principle) code file for quick validation or replication use. Below are steps to use it:

1. Prepare Node.js 16+ execute environemnt;
2. In terminal, use the command `$ node cross-tester.js <lang> <abs path to fixture dir> <analyzer name> null` to perform the matching algorithm used in the paper. For each testcase, the script outputs JSON data it reads in as well as evaluation result as a JS object, and in the end, the total accumulated result will also be shown, you would use this to calculate fragemented precentages as described in the paper.
    > Script usage example:
    > ```sh
    > $ node cross-tester.js java .../PublicData/RQ2/java understand null
    > ```
    > You could use `-h` for a comprehensive usage guidance.

### `RQ3`

`RQ3` contains the pair comparison results for analyzers on targeting languages respectively.

> Please note that data for RQ3 are extremely large and thus are hosted on an external online drive [here](https://1drv.ms/u/s!ArRpq5VLlwvAh1jwjNFBis3FtGR0?e=lifF10). This repo only contains simplified sample demo of data.

#### `RQ3/Raw/<project>/<tool>_<project>_<entity/dependency>.json`

This pattern of JSON files are the raw output of analyzers on the targeted project (denoted as `<project>`), where each JSON item is an entity / dependency with name, type and etc.

#### `RQ3/Results/<project>/<entity/dependency>_<toolA>_<toolB>.json`

This pattern of JSON files are the consistency comparison results against `toolA` and `toolB`, where each JSON contains two top-level keys `eq_set` (means items inside are equal between the two tools) and `ne_set` (means items inside are NOT equal between the two tools).

For each item inside the `eq_set`, entities or dependencies can be found inside two keys `lgroup` and `rgroup`, where each group is an array containing one (or multiple) entity or dependency for this specific equal pair. Whereas in `ne_set`, entities or dependencies from different tools are stored as a mixed array.

### `RQ4`

`RQ4` contains the project lists that directly retrieved from the GitHub API and the corresponding statistics files:

#### `RQ4/Lists/<lang>.csv`

This pattern of CSV files is the project list for a specific language.

#### `RQ4/Results/<lang>.csv`

This pattern of CSV files is the corresponding statistic, where columns represents `LoC`, `<tool>-time` and `<tool>-memory`.

> A cell with content as -1 or 0 represents a timeout (the execution time has exceeded 30 minutes, and you may see some numbers greater than 30 minutes, that is for the test purpose and have low impact on observations).
