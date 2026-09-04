package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.UserBox;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class PropertyBoxParserImpl extends AbstractBoxParser {
    static String[] EMPTY_STRING_ARRAY = new String[0];
    Properties mapping;
    Pattern constuctorPattern = Pattern.compile("(.*)\\((.*?)\\)");
    StringBuilder buildLookupStrings = new StringBuilder();
    ThreadLocal<String> clazzName = new ThreadLocal<>();
    ThreadLocal<String[]> param = new ThreadLocal<>();

    public PropertyBoxParserImpl(String... strArr) {
        InputStream resourceAsStream = getClass().getResourceAsStream("/isoparser-default.properties");
        try {
            Properties properties = new Properties();
            this.mapping = properties;
            try {
                properties.load(resourceAsStream);
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                Enumeration<URL> resources = (contextClassLoader == null ? ClassLoader.getSystemClassLoader() : contextClassLoader).getResources("isoparser-custom.properties");
                while (resources.hasMoreElements()) {
                    InputStream inputStreamOpenStream = resources.nextElement().openStream();
                    try {
                        this.mapping.load(inputStreamOpenStream);
                        inputStreamOpenStream.close();
                    } catch (Throwable th2) {
                        inputStreamOpenStream.close();
                        throw th2;
                    }
                }
                for (String str : strArr) {
                    this.mapping.load(getClass().getResourceAsStream(str));
                }
                try {
                    resourceAsStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        } catch (Throwable th3) {
            try {
                resourceAsStream.close();
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            throw th3;
        }
    }

    @Override // com.coremedia.iso.AbstractBoxParser
    public Box createBox(String str, byte[] bArr, String str2) {
        invoke(str, bArr, str2);
        String[] strArr = this.param.get();
        try {
            Class<?> cls = Class.forName(this.clazzName.get());
            if (strArr.length <= 0) {
                return (Box) cls.newInstance();
            }
            Class<?>[] clsArr = new Class[strArr.length];
            Object[] objArr = new Object[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if ("userType".equals(strArr[i10])) {
                    objArr[i10] = bArr;
                    clsArr[i10] = byte[].class;
                } else if ("type".equals(strArr[i10])) {
                    objArr[i10] = str;
                    clsArr[i10] = String.class;
                } else {
                    if (!"parent".equals(strArr[i10])) {
                        throw new InternalError("No such param: " + strArr[i10]);
                    }
                    objArr[i10] = str2;
                    clsArr[i10] = String.class;
                }
            }
            return (Box) cls.getConstructor(clsArr).newInstance(objArr);
        } catch (ClassNotFoundException e10) {
            throw new RuntimeException(e10);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InstantiationException e12) {
            throw new RuntimeException(e12);
        } catch (NoSuchMethodException e13) {
            throw new RuntimeException(e13);
        } catch (InvocationTargetException e14) {
            throw new RuntimeException(e14);
        }
    }

    public void invoke(String str, byte[] bArr, String str2) {
        String property;
        if (bArr == null) {
            property = this.mapping.getProperty(str);
            if (property == null) {
                StringBuilder sb2 = this.buildLookupStrings;
                sb2.append(str2);
                sb2.append('-');
                sb2.append(str);
                String string = sb2.toString();
                this.buildLookupStrings.setLength(0);
                property = this.mapping.getProperty(string);
            }
        } else {
            if (!UserBox.TYPE.equals(str)) {
                throw new RuntimeException("we have a userType but no uuid box type. Something's wrong");
            }
            property = this.mapping.getProperty("uuid[" + Hex.encodeHex(bArr).toUpperCase() + "]");
            if (property == null) {
                property = this.mapping.getProperty(String.valueOf(str2) + "-uuid[" + Hex.encodeHex(bArr).toUpperCase() + "]");
            }
            if (property == null) {
                property = this.mapping.getProperty(UserBox.TYPE);
            }
        }
        if (property == null) {
            property = this.mapping.getProperty("default");
        }
        if (property == null) {
            throw new RuntimeException("No box object found for " + str);
        }
        if (!property.endsWith(")")) {
            this.param.set(EMPTY_STRING_ARRAY);
            this.clazzName.set(property);
            return;
        }
        Matcher matcher = this.constuctorPattern.matcher(property);
        if (!matcher.matches()) {
            throw new RuntimeException("Cannot work with that constructor: " + property);
        }
        this.clazzName.set(matcher.group(1));
        if (matcher.group(2).length() == 0) {
            this.param.set(EMPTY_STRING_ARRAY);
        } else {
            this.param.set(matcher.group(2).length() > 0 ? matcher.group(2).split(",") : new String[0]);
        }
    }

    public PropertyBoxParserImpl(Properties properties) {
        this.mapping = properties;
    }
}
