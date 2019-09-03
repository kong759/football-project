class Teamlist {
  constructor() {
    this.searchForm = document.querySelector("#searchForm");
    this.searchButton = document.querySelector("#searchButton");
  }
  setSearchEvent() {
    this.searchForm.addEventListener("click", e => {
      if (e.target === this.searchButton) {
        this.searchForm.submit();
      }
    });
  }
}

const teamlist = new Teamlist();