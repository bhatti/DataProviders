package com.plexobject.dp.provider;

import com.plexobject.dp.domain.MetaFields;

/**
 * This interface defines a method for producing data fields given input
 * 
 * @author shahzad bhatti
 *
 */
public interface DataProvider extends DataProducer, Comparable<DataProvider> {
    /**
     * This method returns required request fields
     * 
     * @return
     */
    MetaFields getMandatoryRequestFields();

    /**
     * This method returns optional request fields
     * 
     * @return
     */
    MetaFields getOptionalRequestFields();

    /**
     * This method returns response fields information
     * 
     * @return
     */
    MetaFields getResponseFields();

    /**
     * This method returns granularity of task so that a separate thread can be
     * used to execute it
     * 
     * @return
     */
    TaskGranularity getTaskGranularity();
}