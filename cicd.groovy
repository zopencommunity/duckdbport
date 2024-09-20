node('linux')
{
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/zopencommunity/duckdbport.git'), string(name: 'PORT_DESCRIPTION', value: 'DuckDB is an in-process SQL OLAP Database Management System' )]
  }
}
