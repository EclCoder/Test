package com.google.api.client.http;

import com.google.api.client.util.ArrayValueMap;
import com.google.api.client.util.Charsets;
import com.google.api.client.util.ClassInfo;
import com.google.api.client.util.Data;
import com.google.api.client.util.FieldInfo;
import com.google.api.client.util.GenericData;
import com.google.api.client.util.ObjectParser;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.Throwables;
import com.google.api.client.util.Types;
import com.google.api.client.util.escape.CharEscapers;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class UrlEncodedParser implements ObjectParser {
    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    public static final String MEDIA_TYPE = new HttpMediaType(CONTENT_TYPE).setCharsetParameter(Charsets.UTF_8).build();

    public static void parse(String str, Object obj) {
        parse(str, obj, true);
    }

    private static Object parseValue(Type type, List<Type> list, String str) {
        return Data.parsePrimitiveValue(Data.resolveWildcardTypeOrTypeVariable(list, type), str);
    }

    @Override // com.google.api.client.util.ObjectParser
    public <T> T parseAndClose(InputStream inputStream, Charset charset, Class<T> cls) {
        return (T) parseAndClose((Reader) new InputStreamReader(inputStream, charset), (Class) cls);
    }

    public static void parse(String str, Object obj, boolean z10) {
        if (str == null) {
            return;
        }
        try {
            parse(new StringReader(str), obj, z10);
        } catch (IOException e10) {
            throw Throwables.propagate(e10);
        }
    }

    @Override // com.google.api.client.util.ObjectParser
    public Object parseAndClose(InputStream inputStream, Charset charset, Type type) {
        return parseAndClose(new InputStreamReader(inputStream, charset), type);
    }

    public static void parse(Reader reader, Object obj) throws IOException {
        parse(reader, obj, true);
    }

    public static void parse(Reader reader, Object obj, boolean z10) throws IOException {
        int i10;
        String string;
        Class<?> cls = obj.getClass();
        ClassInfo classInfoOf = ClassInfo.of(cls);
        List listAsList = Arrays.asList(cls);
        GenericData genericData = GenericData.class.isAssignableFrom(cls) ? (GenericData) obj : null;
        Map map = Map.class.isAssignableFrom(cls) ? (Map) obj : null;
        ArrayValueMap arrayValueMap = new ArrayValueMap(obj);
        StringWriter stringWriter = new StringWriter();
        StringWriter stringWriter2 = new StringWriter();
        do {
            boolean z11 = true;
            while (true) {
                i10 = reader.read();
                if (i10 == -1 || i10 == 38) {
                    break;
                }
                if (i10 != 61) {
                    if (z11) {
                        stringWriter.write(i10);
                    } else {
                        stringWriter2.write(i10);
                    }
                } else if (z11) {
                    z11 = false;
                } else {
                    stringWriter2.write(i10);
                }
            }
            String strDecodeUri = z10 ? CharEscapers.decodeUri(stringWriter.toString()) : stringWriter.toString();
            if (strDecodeUri.length() != 0) {
                if (z10) {
                    string = CharEscapers.decodeUri(stringWriter2.toString());
                } else {
                    string = stringWriter2.toString();
                }
                FieldInfo fieldInfo = classInfoOf.getFieldInfo(strDecodeUri);
                if (fieldInfo != null) {
                    Type typeResolveWildcardTypeOrTypeVariable = Data.resolveWildcardTypeOrTypeVariable(listAsList, fieldInfo.getGenericType());
                    if (Types.isArray(typeResolveWildcardTypeOrTypeVariable)) {
                        Class<?> rawArrayComponentType = Types.getRawArrayComponentType(listAsList, Types.getArrayComponentType(typeResolveWildcardTypeOrTypeVariable));
                        arrayValueMap.put(fieldInfo.getField(), rawArrayComponentType, parseValue(rawArrayComponentType, listAsList, string));
                    } else if (Types.isAssignableToOrFrom(Types.getRawArrayComponentType(listAsList, typeResolveWildcardTypeOrTypeVariable), Iterable.class)) {
                        Collection<Object> collectionNewCollectionInstance = (Collection) fieldInfo.getValue(obj);
                        if (collectionNewCollectionInstance == null) {
                            collectionNewCollectionInstance = Data.newCollectionInstance(typeResolveWildcardTypeOrTypeVariable);
                            fieldInfo.setValue(obj, collectionNewCollectionInstance);
                        }
                        collectionNewCollectionInstance.add(parseValue(typeResolveWildcardTypeOrTypeVariable == Object.class ? null : Types.getIterableParameter(typeResolveWildcardTypeOrTypeVariable), listAsList, string));
                    } else {
                        fieldInfo.setValue(obj, parseValue(typeResolveWildcardTypeOrTypeVariable, listAsList, string));
                    }
                } else if (map != null) {
                    ArrayList arrayList = (ArrayList) map.get(strDecodeUri);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        if (genericData != null) {
                            genericData.set(strDecodeUri, arrayList);
                        } else {
                            map.put(strDecodeUri, arrayList);
                        }
                    }
                    arrayList.add(string);
                }
            }
            stringWriter = new StringWriter();
            stringWriter2 = new StringWriter();
        } while (i10 != -1);
        arrayValueMap.setValues();
    }

    @Override // com.google.api.client.util.ObjectParser
    public <T> T parseAndClose(Reader reader, Class<T> cls) {
        return (T) parseAndClose(reader, (Type) cls);
    }

    @Override // com.google.api.client.util.ObjectParser
    public Object parseAndClose(Reader reader, Type type) throws IOException {
        Preconditions.checkArgument(type instanceof Class, "dataType has to be of type Class<?>");
        Object objNewInstance = Types.newInstance((Class) type);
        parse(new BufferedReader(reader), objNewInstance);
        return objNewInstance;
    }
}
