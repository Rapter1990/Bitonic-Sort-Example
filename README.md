<h1>Bitonic Sort Example</h1>

<ul>
  <li>Bitonic Sort is a classic parallel algorithm for sorting
      <ul>
        <li>Bitonic sort does O(n Log 2n) comparisons</li>
        <li>The number of comparisons done by Bitonic sort are more than popular sorting algorithms like Merge Sort [ does O(nLogn) comparisons], but Bitonice sort is better for parallel implementation because we always compare elements in predefined sequence and the sequence of comparison doesn’t depend on data. Therefore it is suitable for implementation in hardware and parallel processor array</li>
        <li>Bitonic Sort must be done if number of elements to sort are 2^n. The procedure of bitonic sequence fails if the number of elements are not in aforementioned quantity precisely</li>
      </ul>
  </li>
  <li>This java example shows how to sort an element of Java ArrayList using Quick Sort method of Collections class.</li>
</ul>

<h3>The objective of Program</h3>
<ul>
  <li>The program firstly assign some values including person's atttributes to its object and performs sort process in terms of each attribute title. All sort process is implemented by Turkish alphabetical order.</li>
</ul>


<h3>Files contaning in this repository</h3>
<ul>
  <li>src
    <ul>
      <li>mergesort
        <ul>
          <li>BitonicSortProcess.java</li>
        </ul>
      </li>
      <li>main
        <ul>
          <li>Main.java</li>
        </ul>
      </li>
      <li>model
        <ul>
          <li>Person.java</li>
        </ul>
      </li>
      <li>util
        <ul>
          <li>DefineValues.java</li>
          <li>ShowProcess.java</li>
        </ul>
      </li>
    </ul>
  </li>
</ul>

<h3>Explaining an inforamtion of each file</h3>

<table>
  <tr>
    <th>Files Names</th>
    <th>Information</th>
  </tr>
  <tr>
    <td>BitonicSortProcess.java</td>
    <td>Implementing BitonicSort Sort Process by Turkish alphabetical order</td>
  </tr>
  <tr>
    <td>Person.java</td>
    <td>Defining it as a POJO</td>
  </tr>
  <tr>
    <td>Main.java</td>
    <td>Handle with all project files to run the program</td>
  </tr>
  <tr>
    <td>ShowProcess.java</td>
    <td>Showing all information about Person Object as output </td>
  </tr>
  <tr>
    <td>DefineValues.java</td>
    <td>Filling its attributes into Person Object</td>
  </tr>
</table>
