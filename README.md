# kafka-protobuf

## Steps for running the application:

    1. Start Kakfa containers using the following command after starting Docker
        -- docker compose -f docker-compose.yaml down
    2. Start the producer application # https://github.com/BalarajuK/kafka-protobuf
    3. Start the consumer application
    4. Publish test data using the end point localhost:8090/stock from produce application
            {    
                "name": "INFY",
                "instrumentToken": "INFY:NSE",
                "price":"2000.00"
            }
    5. Test the consumer application result by using end point localhost:8095/stock/count?stock-name=INFY from Consumer application