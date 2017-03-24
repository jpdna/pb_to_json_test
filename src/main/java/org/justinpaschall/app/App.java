package org.justinpaschall.app;

import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.ValueOrBuilder;
import ga4gh.Variants;
import ga4gh.Variants.Variant;
import ga4gh.Variants.Variant.Builder;


import com.google.protobuf.util.JsonFormat;
import com.google.protobuf.util.JsonFormat.Printer;



/**
 * Demonstrate JSON pb problem
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to the GA4GH java API demo App!" );

        ga4gh.Variants.Variant.Builder ga4ghVariantBuilder = ga4gh.Variants.Variant.newBuilder();

        ga4ghVariantBuilder.setVariantSetId("12345").setStart(10000);

        Variant variant = ga4ghVariantBuilder.build();

        // note: maybe the solution has to do with this TypeRegistry stuff, but can't seem to figure out
        // https://developers.google.com/protocol-buffers/docs/reference/java/com/google/protobuf/util/JsonFormat.TypeRegistry.Builder


        com.google.protobuf.util.JsonFormat.printer().print(variant);

        System.out.println( "Here is my variant: " + variant);

    }
}
