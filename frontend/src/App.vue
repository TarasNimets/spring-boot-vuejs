<template>
  <div id="app">
    <main-panel></main-panel>
    <search-table></search-table>
  </div>
</template>

<script>
  import Panel from './Panel.vue';
  import SearchTable from './SearchTable.vue';

  export default {
    components: {
      'main-panel': Panel,
      'search-table': SearchTable
    }
  }
</script>
