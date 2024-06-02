def call(String aws_account_id, String region, String ecrRepoName){
    
    sh """
     docker build -t ${ecrRepoName}:${BUILD_NUMBER} .
     docker tag ${ecrRepoName}:${BUILD_NUMBER} ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:${BUILD_NUMBER}
    """
}
