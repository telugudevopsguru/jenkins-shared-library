def call(String branch, String credentialsId, String url) {
    git branch: branch, credentialsId: credentialsId, url: url
}

