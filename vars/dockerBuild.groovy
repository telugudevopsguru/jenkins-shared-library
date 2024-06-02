def call(String aws_account_id, String region, String ecrRepoName){
    
    sh """
     docker build -t ${ecrRepoName}:latest .
     docker tag ${ecrRepoName}:latest ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest
    """
}
