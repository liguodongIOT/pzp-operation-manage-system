[toc]

# pzp-operation-manage-system



```shell
curl -XGET  http://10.250.140.14:9200/_cat/indices

curl -XPUT "http://10.250.140.14:9200/user_info_v1?pretty" -d '
{
    "aliases": {
        "user_info_alise": {}
    },
    "settings": {
        "number_of_shards": 3,
        "number_of_replicas": 1
    },
    "mappings": {
        "user_info": {
            "dynamic": "false",
            "properties": {
                "id": {
                    "type": "integer"
                },
                "name": {
                    "type": "string",
                    "analyzer": "ik_max_word",
                    "search_analyzer": "ik_smart"
                },
                "age": {
                    "type": "integer"
                }
            }
        }
    }
}'


curl -XGET  http://10.250.140.14:9200/user_info_v1?pretty
```