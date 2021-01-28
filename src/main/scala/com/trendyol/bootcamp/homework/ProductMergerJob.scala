package com.trendyol.bootcamp.homework

object ProductMergerJob {

  def main(args: Array[String]): Unit = {

    /**
    * Find the latest version of each product in every run, and save it as snapshot.
    *
    * Product data stored under the data/homework folder.
    * Read data/homework/initial_data.json for the first run.
    * Read data/homework/cdc_data.json for the nex runs.
    *
    * Save results as json, parquet or etc.
    *
    * Note: You can use SQL, dataframe or dataset APIs, but type safe implementation is recommended.
    */

    // Solutions
    /**
    * Notes from class
    * Batch olarak yapmalisin
    * Ornek datalar: 
    * {"id":9,"name":"product9","category":"Laptop","brand":"apple","color":"black","price":5000.0,"timestamp":1611141595000}
    * {"id":10,"name":"product10","category":"Mobile Phone","brand":"apple","color":"white","price":1000.0,"timestamp":1611141595000}
    * There 10 lines of data in initial_data.json
    * You need to check the newly added data and check whether ids are same or Note
    * if ids are same you need to update the data
    * if there are more than one from the same data you need to get the data with latest timestamp
    * if there is a data with new id you also need to add it to the dataset
    * and save it as as JSON
    */

    // NOTE: I HAVE IMPLEMENTED AS PSEUDEOCODE
    // Actually I couldnt understand the part where we are gonna use batch implementation
    /*
    * Pseudocode
    * define a class 
    * PRODUCT = class for data (which will have the instances same as with the fields of data)
    * 
    * Class MERGER () 
    * 
    *   define function MERGERFUNC
    *     ALL = get combitanion of both existing and new dataset by using the PRODUCT class
    *     filter ALL by partitioning according to id and sort according to timestamp and get only first data
    *    
    * MAIN class ()
    *   intilize sparksession
    *   read data from initial_data.json 
    *   and call MERGERFUNC with the data in cdc_data
    *
    */
  }

}