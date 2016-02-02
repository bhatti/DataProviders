package com.plexobject.dp.sample.domain;

import com.plexobject.dp.domain.MetaField;
import com.plexobject.dp.domain.MetaFieldFactory;
import com.plexobject.dp.domain.MetaFieldType;

public class SharedMeta {
    public static MetaField accountId = MetaFieldFactory.create("accountId",
            MetaFieldType.SCALAR_INTEGER, true);
    public static MetaField symbol = MetaFieldFactory.create("symbol",
            MetaFieldType.SCALAR_TEXT, true);
    public static MetaField underlyingSymbol = MetaFieldFactory.create(
            "underlyingSymbol", MetaFieldType.SCALAR_TEXT, true);
    public static MetaField exchange = MetaFieldFactory.create("exchange",
            MetaFieldType.SCALAR_TEXT, true);
    public static MetaField marketSession = MetaFieldFactory
            .createText("marketSession");

}
