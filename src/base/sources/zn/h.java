package zn;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Properties;
import org.apache.commons.logging.LogConfigurationException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static PrintStream f59018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f59019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ClassLoader f59020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static Hashtable f59021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static /* synthetic */ Class f59022e;

    static {
        String strY;
        Class clsB = f59022e;
        if (clsB == null) {
            clsB = b("org.apache.commons.logging.LogFactory");
            f59022e = clsB;
        }
        ClassLoader classLoaderG = g(clsB);
        f59020c = classLoaderG;
        if (classLoaderG == null) {
            strY = "BOOTLOADER";
        } else {
            try {
                strY = y(classLoaderG);
            } catch (SecurityException unused) {
                strY = "UNKNOWN";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[LogFactory from ");
        stringBuffer.append(strY);
        stringBuffer.append("] ");
        f59019b = stringBuffer.toString();
        f59018a = s();
        Class clsB2 = f59022e;
        if (clsB2 == null) {
            clsB2 = b("org.apache.commons.logging.LogFactory");
            f59022e = clsB2;
        }
        u(clsB2);
        f59021d = d();
        if (t()) {
            v("BOOTSTRAP COMPLETED");
        }
    }

    static /* synthetic */ Class b(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e10) {
            throw new NoClassDefFoundError(e10.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0190 A[Catch: Exception -> 0x0014, TryCatch #5 {Exception -> 0x0014, blocks: (B:5:0x0009, B:7:0x000d, B:14:0x001e, B:16:0x0024, B:18:0x002a, B:25:0x009d, B:19:0x004f, B:21:0x0055, B:23:0x007f, B:24:0x0085, B:46:0x0127, B:48:0x012b, B:50:0x0131, B:51:0x015b, B:61:0x018a, B:63:0x0190, B:64:0x01ad, B:54:0x015e, B:56:0x0162, B:58:0x0168, B:59:0x0188, B:30:0x00a9, B:32:0x00ad, B:34:0x00cc, B:35:0x00d2, B:37:0x00e0, B:39:0x0109, B:41:0x0114, B:42:0x011b, B:43:0x0124, B:38:0x0104), top: B:85:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d9  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0015: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:22), block:B:9:0x0015 */
    protected static Object c(String str, ClassLoader classLoader) {
        Class<?> cls;
        Class clsB;
        Class<?> clsLoadClass;
        Class<?> cls2;
        Class<?> cls3 = null;
        try {
            if (classLoader != null) {
                try {
                    clsLoadClass = classLoader.loadClass(str);
                    try {
                        Class clsB2 = f59022e;
                        if (clsB2 == null) {
                            clsB2 = b("org.apache.commons.logging.LogFactory");
                            f59022e = clsB2;
                        }
                        if (clsB2.isAssignableFrom(clsLoadClass)) {
                            if (t()) {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("Loaded class ");
                                stringBuffer.append(clsLoadClass.getName());
                                stringBuffer.append(" from classloader ");
                                stringBuffer.append(y(classLoader));
                                v(stringBuffer.toString());
                            }
                        } else if (t()) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Factory class ");
                            stringBuffer2.append(clsLoadClass.getName());
                            stringBuffer2.append(" loaded from classloader ");
                            stringBuffer2.append(y(clsLoadClass.getClassLoader()));
                            stringBuffer2.append(" does not extend '");
                            Class clsB3 = f59022e;
                            if (clsB3 == null) {
                                clsB3 = b("org.apache.commons.logging.LogFactory");
                                f59022e = clsB3;
                            }
                            stringBuffer2.append(clsB3.getName());
                            stringBuffer2.append("' as loaded by this classloader.");
                            v(stringBuffer2.toString());
                            w("[BAD CL TREE] ", classLoader);
                        }
                        android.support.v4.media.session.b.a(clsLoadClass.newInstance());
                        return null;
                    } catch (ClassCastException unused) {
                        if (classLoader == f59020c) {
                            boolean zR = r(clsLoadClass);
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("The application has specified that a custom LogFactory implementation ");
                            stringBuffer3.append("should be used but Class '");
                            stringBuffer3.append(str);
                            stringBuffer3.append("' cannot be converted to '");
                            Class clsB4 = f59022e;
                            if (clsB4 == null) {
                                clsB4 = b("org.apache.commons.logging.LogFactory");
                                f59022e = clsB4;
                            }
                            stringBuffer3.append(clsB4.getName());
                            stringBuffer3.append("'. ");
                            if (zR) {
                                stringBuffer3.append("The conflict is caused by the presence of multiple LogFactory classes ");
                                stringBuffer3.append("in incompatible classloaders. ");
                                stringBuffer3.append("Background can be found in http://commons.apache.org/logging/tech.html. ");
                                stringBuffer3.append("If you have not explicitly specified a custom LogFactory then it is likely ");
                                stringBuffer3.append("that the container has set one without your knowledge. ");
                                stringBuffer3.append("In this case, consider using the commons-logging-adapters.jar file or ");
                                stringBuffer3.append("specifying the standard LogFactory from the command line. ");
                            } else {
                                stringBuffer3.append("Please check the custom implementation. ");
                            }
                            stringBuffer3.append("Help can be found @http://commons.apache.org/logging/troubleshooting.html.");
                            if (t()) {
                                v(stringBuffer3.toString());
                            }
                            throw new ClassCastException(stringBuffer3.toString());
                        }
                        if (t()) {
                            StringBuffer stringBuffer4 = new StringBuffer();
                            stringBuffer4.append("Unable to load factory class via classloader ");
                            stringBuffer4.append(y(classLoader));
                            stringBuffer4.append(" - trying the classloader associated with this LogFactory.");
                            v(stringBuffer4.toString());
                        }
                        cls2 = Class.forName(str);
                        android.support.v4.media.session.b.a(cls2.newInstance());
                        return null;
                    } catch (ClassNotFoundException e10) {
                        e = e10;
                        if (classLoader == f59020c) {
                            if (t()) {
                                StringBuffer stringBuffer5 = new StringBuffer();
                                stringBuffer5.append("Unable to locate any class called '");
                                stringBuffer5.append(str);
                                stringBuffer5.append("' via classloader ");
                                stringBuffer5.append(y(classLoader));
                                v(stringBuffer5.toString());
                            }
                            throw e;
                        }
                        if (t()) {
                            StringBuffer stringBuffer6 = new StringBuffer();
                            stringBuffer6.append("Unable to load factory class via classloader ");
                            stringBuffer6.append(y(classLoader));
                            stringBuffer6.append(" - trying the classloader associated with this LogFactory.");
                            v(stringBuffer6.toString());
                        }
                        cls2 = Class.forName(str);
                        android.support.v4.media.session.b.a(cls2.newInstance());
                        return null;
                    } catch (NoClassDefFoundError e11) {
                        e = e11;
                        if (classLoader == f59020c) {
                            if (t()) {
                                StringBuffer stringBuffer7 = new StringBuffer();
                                stringBuffer7.append("Class '");
                                stringBuffer7.append(str);
                                stringBuffer7.append("' cannot be loaded");
                                stringBuffer7.append(" via classloader ");
                                stringBuffer7.append(y(classLoader));
                                stringBuffer7.append(" - it depends on some other class that cannot be found.");
                                v(stringBuffer7.toString());
                            }
                            throw e;
                        }
                        if (t()) {
                            StringBuffer stringBuffer8 = new StringBuffer();
                            stringBuffer8.append("Unable to load factory class via classloader ");
                            stringBuffer8.append(y(classLoader));
                            stringBuffer8.append(" - trying the classloader associated with this LogFactory.");
                            v(stringBuffer8.toString());
                        }
                        cls2 = Class.forName(str);
                        android.support.v4.media.session.b.a(cls2.newInstance());
                        return null;
                    }
                } catch (ClassCastException unused2) {
                    clsLoadClass = null;
                } catch (ClassNotFoundException e12) {
                    e = e12;
                } catch (Exception e13) {
                    e = e13;
                    if (t()) {
                        v("Unable to create LogFactory instance.");
                    }
                    if (cls3 != null) {
                        clsB = f59022e;
                        if (clsB == null) {
                            clsB = b("org.apache.commons.logging.LogFactory");
                            f59022e = clsB;
                        }
                        if (!clsB.isAssignableFrom(cls3)) {
                            return new LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e);
                        }
                    }
                    return new LogConfigurationException(e);
                } catch (NoClassDefFoundError e14) {
                    e = e14;
                }
            }
            if (t()) {
                StringBuffer stringBuffer9 = new StringBuffer();
                stringBuffer9.append("Unable to load factory class via classloader ");
                stringBuffer9.append(y(classLoader));
                stringBuffer9.append(" - trying the classloader associated with this LogFactory.");
                v(stringBuffer9.toString());
            }
            cls2 = Class.forName(str);
            try {
                android.support.v4.media.session.b.a(cls2.newInstance());
                return null;
            } catch (Exception e15) {
                cls3 = cls2;
                e = e15;
                if (t()) {
                    v("Unable to create LogFactory instance.");
                }
                if (cls3 != null) {
                    clsB = f59022e;
                    if (clsB == null) {
                        clsB = b("org.apache.commons.logging.LogFactory");
                        f59022e = clsB;
                    }
                    if (!clsB.isAssignableFrom(cls3)) {
                        return new LogConfigurationException("The chosen LogFactory implementation does not extend LogFactory. Please check your configuration.", e);
                    }
                }
                return new LogConfigurationException(e);
            }
        } catch (Exception e16) {
            e = e16;
            cls3 = cls;
        }
    }

    private static final Hashtable d() {
        String strP;
        Hashtable hashtable = null;
        try {
            strP = p("org.apache.commons.logging.LogFactory.HashtableImpl", null);
        } catch (SecurityException unused) {
            strP = null;
        }
        if (strP == null) {
            strP = "org.apache.commons.logging.impl.WeakHashtable";
        }
        try {
            hashtable = (Hashtable) Class.forName(strP).newInstance();
        } catch (Throwable th2) {
            q(th2);
            if (!"org.apache.commons.logging.impl.WeakHashtable".equals(strP)) {
                if (t()) {
                    v("[ERROR] LogFactory: Load of custom hashtable failed");
                } else {
                    System.err.println("[ERROR] LogFactory: Load of custom hashtable failed");
                }
            }
        }
        return hashtable == null ? new Hashtable() : hashtable;
    }

    protected static ClassLoader e() {
        try {
            return Thread.currentThread().getContextClassLoader();
        } catch (SecurityException unused) {
            return null;
        }
    }

    private static h f(ClassLoader classLoader) {
        if (classLoader == null) {
            return null;
        }
        android.support.v4.media.session.b.a(f59021d.get(classLoader));
        return null;
    }

    protected static ClassLoader g(Class cls) {
        try {
            return cls.getClassLoader();
        } catch (SecurityException e10) {
            if (t()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("Unable to get classloader for class '");
                stringBuffer.append(cls);
                stringBuffer.append("' due to security restrictions - ");
                stringBuffer.append(e10.getMessage());
                v(stringBuffer.toString());
            }
            throw e10;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    private static final Properties h(ClassLoader classLoader, String str) {
        URL url;
        Properties properties = null;
        try {
            Enumeration enumerationO = o(classLoader, str);
            if (enumerationO == null) {
                return null;
            }
            url = null;
            double d10 = 0.0d;
            while (enumerationO.hasMoreElements()) {
                try {
                    URL url2 = (URL) enumerationO.nextElement();
                    Properties propertiesM = m(url2);
                    if (propertiesM != null) {
                        if (properties == null) {
                            try {
                                String property = propertiesM.getProperty("priority");
                                d10 = property != null ? Double.parseDouble(property) : 0.0d;
                                if (t()) {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append("[LOOKUP] Properties file found at '");
                                    stringBuffer.append(url2);
                                    stringBuffer.append("'");
                                    stringBuffer.append(" with priority ");
                                    stringBuffer.append(d10);
                                    v(stringBuffer.toString());
                                }
                                url = url2;
                                properties = propertiesM;
                            } catch (SecurityException unused) {
                                url = url2;
                                properties = propertiesM;
                                if (t()) {
                                    v("SecurityException thrown while trying to find/read config files.");
                                }
                                if (t()) {
                                    if (properties == null) {
                                        StringBuffer stringBuffer2 = new StringBuffer();
                                        stringBuffer2.append("[LOOKUP] No properties file of name '");
                                        stringBuffer2.append(str);
                                        stringBuffer2.append("' found.");
                                        v(stringBuffer2.toString());
                                    } else {
                                        StringBuffer stringBuffer3 = new StringBuffer();
                                        stringBuffer3.append("[LOOKUP] Properties file of name '");
                                        stringBuffer3.append(str);
                                        stringBuffer3.append("' found at '");
                                        stringBuffer3.append(url);
                                        stringBuffer3.append('\"');
                                        v(stringBuffer3.toString());
                                    }
                                }
                                return properties;
                            }
                        } else {
                            String property2 = propertiesM.getProperty("priority");
                            double d11 = property2 != null ? Double.parseDouble(property2) : 0.0d;
                            if (d11 > d10) {
                                if (t()) {
                                    StringBuffer stringBuffer4 = new StringBuffer();
                                    stringBuffer4.append("[LOOKUP] Properties file at '");
                                    stringBuffer4.append(url2);
                                    stringBuffer4.append("'");
                                    stringBuffer4.append(" with priority ");
                                    stringBuffer4.append(d11);
                                    stringBuffer4.append(" overrides file at '");
                                    stringBuffer4.append(url);
                                    stringBuffer4.append("'");
                                    stringBuffer4.append(" with priority ");
                                    stringBuffer4.append(d10);
                                    v(stringBuffer4.toString());
                                }
                                url = url2;
                                properties = propertiesM;
                                d10 = d11;
                            } else if (t()) {
                                StringBuffer stringBuffer5 = new StringBuffer();
                                stringBuffer5.append("[LOOKUP] Properties file at '");
                                stringBuffer5.append(url2);
                                stringBuffer5.append("'");
                                stringBuffer5.append(" with priority ");
                                stringBuffer5.append(d11);
                                stringBuffer5.append(" does not override file at '");
                                stringBuffer5.append(url);
                                stringBuffer5.append("'");
                                stringBuffer5.append(" with priority ");
                                stringBuffer5.append(d10);
                                v(stringBuffer5.toString());
                            }
                        }
                    }
                } catch (SecurityException unused2) {
                }
            }
            if (t()) {
                if (properties == null) {
                    StringBuffer stringBuffer6 = new StringBuffer();
                    stringBuffer6.append("[LOOKUP] No properties file of name '");
                    stringBuffer6.append(str);
                    stringBuffer6.append("' found.");
                    v(stringBuffer6.toString());
                } else {
                    StringBuffer stringBuffer7 = new StringBuffer();
                    stringBuffer7.append("[LOOKUP] Properties file of name '");
                    stringBuffer7.append(str);
                    stringBuffer7.append("' found at '");
                    stringBuffer7.append(url);
                    stringBuffer7.append('\"');
                    v(stringBuffer7.toString());
                }
            }
            return properties;
        } catch (SecurityException unused3) {
            url = null;
        }
    }

    private static ClassLoader i() {
        return (ClassLoader) AccessController.doPrivileged(new b());
    }

    public static h j() {
        BufferedReader bufferedReader;
        String property;
        ClassLoader classLoaderI = i();
        if (classLoaderI == null && t()) {
            v("Context classloader is null.");
        }
        f(classLoaderI);
        if (t()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("[LOOKUP] LogFactory implementation requested for the first time for context classloader ");
            stringBuffer.append(y(classLoaderI));
            v(stringBuffer.toString());
            w("[LOOKUP] ", classLoaderI);
        }
        Properties propertiesH = h(classLoaderI, "commons-logging.properties");
        ClassLoader classLoader = (propertiesH == null || (property = propertiesH.getProperty("use_tccl")) == null || Boolean.valueOf(property).booleanValue()) ? classLoaderI : f59020c;
        if (t()) {
            v("[LOOKUP] Looking for system property [org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            String strP = p("org.apache.commons.logging.LogFactory", null);
            if (strP != null) {
                if (t()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("[LOOKUP] Creating an instance of LogFactory class '");
                    stringBuffer2.append(strP);
                    stringBuffer2.append("' as specified by system property ");
                    stringBuffer2.append("org.apache.commons.logging.LogFactory");
                    v(stringBuffer2.toString());
                }
                x(strP, classLoader, classLoaderI);
            } else if (t()) {
                v("[LOOKUP] No system property [org.apache.commons.logging.LogFactory] defined.");
            }
        } catch (SecurityException e10) {
            if (t()) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer3.append(z(e10.getMessage()));
                stringBuffer3.append("]. Trying alternative implementations...");
                v(stringBuffer3.toString());
            }
        } catch (RuntimeException e11) {
            if (t()) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[LOOKUP] An exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer4.append(z(e11.getMessage()));
                stringBuffer4.append("] as specified by a system property.");
                v(stringBuffer4.toString());
            }
            throw e11;
        }
        if (t()) {
            v("[LOOKUP] Looking for a resource file of name [META-INF/services/org.apache.commons.logging.LogFactory] to define the LogFactory subclass to use...");
        }
        try {
            InputStream inputStreamN = n(classLoaderI, "META-INF/services/org.apache.commons.logging.LogFactory");
            if (inputStreamN != null) {
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStreamN, C.UTF8_NAME));
                } catch (UnsupportedEncodingException unused) {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStreamN));
                }
                String line = bufferedReader.readLine();
                bufferedReader.close();
                if (line != null && !"".equals(line)) {
                    if (t()) {
                        StringBuffer stringBuffer5 = new StringBuffer();
                        stringBuffer5.append("[LOOKUP]  Creating an instance of LogFactory class ");
                        stringBuffer5.append(line);
                        stringBuffer5.append(" as specified by file '");
                        stringBuffer5.append("META-INF/services/org.apache.commons.logging.LogFactory");
                        stringBuffer5.append("' which was present in the path of the context classloader.");
                        v(stringBuffer5.toString());
                    }
                    x(line, classLoader, classLoaderI);
                }
            } else if (t()) {
                v("[LOOKUP] No resource file with name 'META-INF/services/org.apache.commons.logging.LogFactory' found.");
            }
        } catch (Exception e12) {
            if (t()) {
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append("[LOOKUP] A security exception occurred while trying to create an instance of the custom factory class: [");
                stringBuffer6.append(z(e12.getMessage()));
                stringBuffer6.append("]. Trying alternative implementations...");
                v(stringBuffer6.toString());
            }
        }
        if (propertiesH != null) {
            if (t()) {
                v("[LOOKUP] Looking in properties file for entry with key 'org.apache.commons.logging.LogFactory' to define the LogFactory subclass to use...");
            }
            String property2 = propertiesH.getProperty("org.apache.commons.logging.LogFactory");
            if (property2 != null) {
                if (t()) {
                    StringBuffer stringBuffer7 = new StringBuffer();
                    stringBuffer7.append("[LOOKUP] Properties file specifies LogFactory subclass '");
                    stringBuffer7.append(property2);
                    stringBuffer7.append("'");
                    v(stringBuffer7.toString());
                }
                x(property2, classLoader, classLoaderI);
            } else if (t()) {
                v("[LOOKUP] Properties file has no entry specifying LogFactory subclass.");
            }
        } else if (t()) {
            v("[LOOKUP] No properties file available to determine LogFactory subclass from..");
        }
        if (t()) {
            v("[LOOKUP] Loading the default LogFactory implementation 'org.apache.commons.logging.impl.LogFactoryImpl' via the same classloader that loaded this LogFactory class (ie not looking in the context classloader).");
        }
        x("org.apache.commons.logging.impl.LogFactoryImpl", f59020c, classLoaderI);
        return null;
    }

    public static a k(Class cls) {
        j();
        throw null;
    }

    public static a l(String str) {
        j();
        throw null;
    }

    private static Properties m(URL url) {
        return (Properties) AccessController.doPrivileged(new f(url));
    }

    private static InputStream n(ClassLoader classLoader, String str) {
        return (InputStream) AccessController.doPrivileged(new d(classLoader, str));
    }

    private static Enumeration o(ClassLoader classLoader, String str) {
        return (Enumeration) AccessController.doPrivileged(new e(classLoader, str));
    }

    private static String p(String str, String str2) {
        return (String) AccessController.doPrivileged(new g(str, str2));
    }

    protected static void q(Throwable th2) {
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
    }

    private static boolean r(Class cls) {
        if (cls != null) {
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (classLoader == null) {
                    v("[CUSTOM LOG FACTORY] was loaded by the boot classloader");
                    return false;
                }
                w("[CUSTOM LOG FACTORY] ", classLoader);
                boolean zIsAssignableFrom = Class.forName("zn.h", false, classLoader).isAssignableFrom(cls);
                if (zIsAssignableFrom) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("[CUSTOM LOG FACTORY] ");
                    stringBuffer.append(cls.getName());
                    stringBuffer.append(" implements LogFactory but was loaded by an incompatible classloader.");
                    v(stringBuffer.toString());
                    return zIsAssignableFrom;
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[CUSTOM LOG FACTORY] ");
                stringBuffer2.append(cls.getName());
                stringBuffer2.append(" does not implement LogFactory.");
                v(stringBuffer2.toString());
                return zIsAssignableFrom;
            } catch (ClassNotFoundException unused) {
                v("[CUSTOM LOG FACTORY] LogFactory class cannot be loaded by classloader which loaded the custom LogFactory implementation. Is the custom factory in the right classloader?");
            } catch (LinkageError e10) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[CUSTOM LOG FACTORY] LinkageError thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer3.append(e10.getMessage());
                v(stringBuffer3.toString());
            } catch (SecurityException e11) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[CUSTOM LOG FACTORY] SecurityException thrown whilst trying to determine whether the compatibility was caused by a classloader conflict: ");
                stringBuffer4.append(e11.getMessage());
                v(stringBuffer4.toString());
            }
        }
        return false;
    }

    private static PrintStream s() {
        try {
            String strP = p("org.apache.commons.logging.diagnostics.dest", null);
            if (strP == null) {
                return null;
            }
            if (strP.equals("STDOUT")) {
                return System.out;
            }
            return strP.equals("STDERR") ? System.err : new PrintStream(new FileOutputStream(strP, true));
        } catch (IOException | SecurityException unused) {
            return null;
        }
    }

    protected static boolean t() {
        return f59018a != null;
    }

    private static void u(Class cls) {
        if (t()) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("[ENV] Extension directories (java.ext.dir): ");
                stringBuffer.append(System.getProperty("java.ext.dir"));
                v(stringBuffer.toString());
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("[ENV] Application classpath (java.class.path): ");
                stringBuffer2.append(System.getProperty("java.class.path"));
                v(stringBuffer2.toString());
            } catch (SecurityException unused) {
                v("[ENV] Security setting prevent interrogation of system classpaths.");
            }
            String name = cls.getName();
            try {
                ClassLoader classLoaderG = g(cls);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("[ENV] Class ");
                stringBuffer3.append(name);
                stringBuffer3.append(" was loaded via classloader ");
                stringBuffer3.append(y(classLoaderG));
                v(stringBuffer3.toString());
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append("[ENV] Ancestry of classloader which loaded ");
                stringBuffer4.append(name);
                stringBuffer4.append(" is ");
                w(stringBuffer4.toString(), classLoaderG);
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer5 = new StringBuffer();
                stringBuffer5.append("[ENV] Security forbids determining the classloader for ");
                stringBuffer5.append(name);
                v(stringBuffer5.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(String str) {
        PrintStream printStream = f59018a;
        if (printStream != null) {
            printStream.print(f59019b);
            f59018a.println(str);
            f59018a.flush();
        }
    }

    private static void w(String str, ClassLoader classLoader) {
        if (t()) {
            if (classLoader != null) {
                String string = classLoader.toString();
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(y(classLoader));
                stringBuffer.append(" == '");
                stringBuffer.append(string);
                stringBuffer.append("'");
                v(stringBuffer.toString());
            }
            try {
                ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
                if (classLoader != null) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str);
                    stringBuffer2.append("ClassLoader tree:");
                    StringBuffer stringBuffer3 = new StringBuffer(stringBuffer2.toString());
                    do {
                        stringBuffer3.append(y(classLoader));
                        if (classLoader == systemClassLoader) {
                            stringBuffer3.append(" (SYSTEM) ");
                        }
                        try {
                            classLoader = classLoader.getParent();
                            stringBuffer3.append(" --> ");
                        } catch (SecurityException unused) {
                            stringBuffer3.append(" --> SECRET");
                        }
                    } while (classLoader != null);
                    stringBuffer3.append("BOOT");
                    v(stringBuffer3.toString());
                }
            } catch (SecurityException unused2) {
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(str);
                stringBuffer4.append("Security forbids determining the system classloader.");
                v(stringBuffer4.toString());
            }
        }
    }

    protected static h x(String str, ClassLoader classLoader, ClassLoader classLoader2) {
        Object objDoPrivileged = AccessController.doPrivileged(new c(str, classLoader));
        if (objDoPrivileged instanceof LogConfigurationException) {
            LogConfigurationException logConfigurationException = (LogConfigurationException) objDoPrivileged;
            if (!t()) {
                throw logConfigurationException;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("An error occurred while loading the factory class:");
            stringBuffer.append(logConfigurationException.getMessage());
            v(stringBuffer.toString());
            throw logConfigurationException;
        }
        if (t()) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("Created object ");
            stringBuffer2.append(y(objDoPrivileged));
            stringBuffer2.append(" to manage classloader ");
            stringBuffer2.append(y(classLoader2));
            v(stringBuffer2.toString());
        }
        android.support.v4.media.session.b.a(objDoPrivileged);
        return null;
    }

    public static String y(Object obj) {
        if (obj == null) {
            return "null";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(obj.getClass().getName());
        stringBuffer.append("@");
        stringBuffer.append(System.identityHashCode(obj));
        return stringBuffer.toString();
    }

    private static String z(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }
}
