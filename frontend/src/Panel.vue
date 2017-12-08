<template>
  <ul>
    <div>Post Trucks</div>
    <li>
      <img src="./assets/play.png" title="Play" v-on:click="playPress">
      <a>|</a>
    </li>
    <li v-on:click="newPress">
      <img src="./assets/new.png">
      <a>New</a>
    </li>
    <li v-on:click="deletePress">
      <img src="./assets/delete.png">
      <a>Delete All</a>
    </li>
    <li v-on:click="repostPress">
      <img src="./assets/repost.png">
      <a>Repost All</a>
    </li>
  </ul>
</template>

<script>
  export default {
    methods: {
      playPress() {
        this.getAllPosts()
      },
      newPress() {
        alert("some new request")
      },
      deletePress() {
        this.$root.$emit('responseData', [])
      },
      repostPress() {
        alert("some repost request")
      },
      getAllPosts: function() {
        this.$http.get('http://localhost:8080/data').then(function(response) {
          this.$root.$emit('responseData', response.data)
        }, function(error){

        })
      }
    }
  }
</script>

<style scope>
  a{
    font-style: normal;
    font-size: 25px;
    font-family:sans-serif;
  }
  div{
    font-style: normal;
    font-size: 30px;
    font-family:sans-serif;
  }
  li{
    list-style-type: none;
    display: inline-block;
  }
  ul{
    margin-left: 0;
    padding-left: 0;
  }
</style>
