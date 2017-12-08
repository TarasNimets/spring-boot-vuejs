<template>
  <table>
    <thead>
      <tr>
        <th>Rate</th>
        <th>F</th>
        <th>Source</th>
        <th>Age</th>
        <th>Avail</th>
        <th>Truck</th>
        <th>Truck-O</th>
        <th>DH-O</th>
        <th>F/P</th>
        <th>Origin</th>
        <th>Trip</th>
        <th>Destination</th>
        <th>DH-D</th>
        <th>Truck-D</th>
        <th>Length</th>
        <th>Weight</th>
        <th>Company</th>
        <th>Phone</th>
      </tr>
    </thead>
    <tbody>
      <tr v-for="some in somes">
      <td>{{ some.rate }}</td>
      <td>{{ some.f }}</td>
      <td>{{ some.source }}</td>
      <td>{{ some.age }}</td>
      <td>{{ some.avail }}</td>
      <td>{{ some.truck }}</td>
      <td>{{ some.truckO }}</td>
      <td>{{ some.dHO }}</td>
      <td>{{ some.fP }}</td>
      <td>{{ some.origin }}</td>
      <td>{{ some.trip }}</td>
      <td>{{ some.destination }}</td>
      <td>{{ some.dHD }}</td>
      <td>{{ some.truckD }}</td>
      <td>{{ some.length }}</td>
      <td>{{ some.weight }}</td>
      <td>{{ some.company }}</td>
      <td>{{ some.phone }}</td>
      </tr>
    </tbody>
  </table>
</template>

<script>
  export default {
    data () {
      return {
        somes: []
      }
    },
    created(){
      this.$root.$on('responseData', this.changeData)
    },
    methods: {
      changeData(somes) {
        this.somes = somes;
      }
    }
  }
</script>

<style scope>
  table{
    border-collapse: collapse;
    font-size: 18px;
  }

  th, td{
    border: 1px solid;
    padding: 5px 10px;
  }

  thead{
    background: #eee;
  }

  tbody{
    background: white
  }
</style>
