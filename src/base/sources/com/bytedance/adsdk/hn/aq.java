package com.bytedance.adsdk.hn;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import android.util.JsonReader;
import com.bytedance.adsdk.hn.sk.as;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {
    private static final Map<String, orl<dse>> hnj = new HashMap();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static final Set<Object> f11902hn = new HashSet();
    private static final byte[] qor = {80, 75, 3, 4};

    public static orl<dse> hn(Context context, String str) {
        return hn(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static bug<dse> qor(Context context, String str) {
        return qor(context, str, "asset_".concat(String.valueOf(str)));
    }

    public static orl<dse> hn(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return hnj(str2, new Callable<bug<dse>>() { // from class: com.bytedance.adsdk.hn.aq.4
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public bug<dse> call() {
                return aq.qor(applicationContext, str, str2);
            }
        });
    }

    public static orl<dse> hnj(Context context, String str) {
        return hnj(context, str, "url_".concat(String.valueOf(str)));
    }

    public static bug<dse> qor(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return hn(context.getAssets().open(str), str2);
            }
            return hnj(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e10) {
            return new bug<>((Throwable) e10);
        }
    }

    public static orl<dse> hnj(final Context context, final String str, final String str2) {
        return hnj(str2, new Callable<bug<dse>>() { // from class: com.bytedance.adsdk.hn.aq.1
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public bug<dse> call() {
                bug<dse> bugVarHnj = sk.hnj(context).hnj(context, str, str2);
                if (str2 != null && bugVarHnj.hnj() != null) {
                    com.bytedance.adsdk.hn.qor.sk.hnj().hnj(str2, bugVarHnj.hnj());
                }
                return bugVarHnj;
            }
        });
    }

    public static bug<dse> hn(Context context, int i10) {
        return hn(context, i10, qor(context, i10));
    }

    public static orl<dse> hnj(Context context, int i10) {
        return hnj(context, i10, qor(context, i10));
    }

    public static bug<dse> hn(Context context, int i10, String str) {
        try {
            return hn(context.getResources().openRawResource(i10), qor(context, i10));
        } catch (Resources.NotFoundException e10) {
            return new bug<>((Throwable) e10);
        }
    }

    public static orl<dse> hnj(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return hnj(str, new Callable<bug<dse>>() { // from class: com.bytedance.adsdk.hn.aq.5
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public bug<dse> call() {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    context2 = applicationContext;
                }
                return aq.hn(context2, i10, str);
            }
        });
    }

    private static String qor(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder("rawRes");
        sb2.append(hnj(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    public static bug<dse> hn(InputStream inputStream, String str) {
        return hnj(inputStream, str, true);
    }

    private static bug<dse> hn(Context context, ZipInputStream zipInputStream, String str) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        try {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            dse dseVarHnj = null;
            while (nextEntry != null) {
                String name = nextEntry.getName();
                if (name.contains("__MACOSX")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                    zipInputStream.closeEntry();
                } else if (nextEntry.getName().endsWith(".json")) {
                    dseVarHnj = hnj(new JsonReader(new InputStreamReader(zipInputStream)), (String) null, false).hnj();
                } else if (!name.endsWith(".png") && !name.endsWith(".webp") && !name.endsWith(".jpg") && !name.endsWith(".jpeg")) {
                    if (!name.endsWith(".ttf") && !name.endsWith(".otf")) {
                        zipInputStream.closeEntry();
                    } else if (name.contains("../")) {
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                    } else {
                        String[] strArrSplit = name.split("/");
                        String str2 = strArrSplit[strArrSplit.length - 1];
                        String str3 = str2.split("\\.")[0];
                        File file = new File(context.getCacheDir(), str2);
                        new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int i10 = zipInputStream.read(bArr);
                                    if (i10 == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i10);
                                }
                                fileOutputStream.flush();
                                fileOutputStream.close();
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (Throwable th4) {
                                        th2.addSuppressed(th4);
                                    }
                                    throw th3;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            file.getAbsolutePath();
                        }
                        map2.put(str3, typefaceCreateFromFile);
                    }
                } else if (name.contains("../")) {
                    zipInputStream.closeEntry();
                    nextEntry = zipInputStream.getNextEntry();
                } else {
                    String[] strArrSplit2 = name.split("/");
                    map.put(strArrSplit2[strArrSplit2.length - 1], BitmapFactory.decodeStream(zipInputStream));
                }
                nextEntry = zipInputStream.getNextEntry();
            }
            if (dseVarHnj == null) {
                return new bug<>((Throwable) new IllegalArgumentException("Unable to parse composition"));
            }
            for (Map.Entry entry : map.entrySet()) {
                ta taVarHnj = hnj(dseVarHnj, (String) entry.getKey());
                if (taVarHnj != null) {
                    taVarHnj.hnj(com.bytedance.adsdk.hn.dkl.dkl.hnj((Bitmap) entry.getValue(), taVarHnj.hnj(), taVarHnj.hn()));
                }
            }
            for (Map.Entry entry2 : map2.entrySet()) {
                boolean z10 = false;
                for (com.bytedance.adsdk.hn.qor.qor qorVar : dseVarHnj.fc().values()) {
                    if (qorVar.hnj().equals(entry2.getKey())) {
                        qorVar.hnj((Typeface) entry2.getValue());
                        z10 = true;
                    }
                }
                if (!z10) {
                }
            }
            if (map.isEmpty()) {
                Iterator<Map.Entry<String, ta>> it = dseVarHnj.jip().entrySet().iterator();
                while (it.hasNext()) {
                    ta value = it.next().getValue();
                    if (value == null) {
                        return null;
                    }
                    String strOjm = value.ojm();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    if (strOjm.startsWith("data:") && strOjm.indexOf("base64,") > 0) {
                        try {
                            byte[] bArrDecode = Base64.decode(strOjm.substring(strOjm.indexOf(44) + 1), 0);
                            value.hnj(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                        } catch (IllegalArgumentException unused2) {
                            return null;
                        }
                    }
                }
            }
            for (Map.Entry<String, ta> entry3 : dseVarHnj.jip().entrySet()) {
                if (entry3.getValue().dnm() == null) {
                    return new bug<>((Throwable) new IllegalStateException("There is no image for " + entry3.getValue().ojm()));
                }
            }
            if (str != null) {
                com.bytedance.adsdk.hn.qor.sk.hnj().hnj(str, dseVarHnj);
            }
            return new bug<>(dseVarHnj);
        } catch (IOException e10) {
            return new bug<>((Throwable) e10);
        }
    }

    private static boolean hnj(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static orl<dse> hnj(final InputStream inputStream, final String str) {
        return hnj(str, new Callable<bug<dse>>() { // from class: com.bytedance.adsdk.hn.aq.6
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
            public bug<dse> call() {
                return aq.hn(inputStream, str);
            }
        });
    }

    private static bug<dse> hnj(InputStream inputStream, String str, boolean z10) {
        try {
            return hnj(new JsonReader(new InputStreamReader(inputStream)), str);
        } finally {
            if (z10) {
                com.bytedance.adsdk.hn.dkl.dkl.hnj(inputStream);
            }
        }
    }

    public static bug<dse> hnj(JsonReader jsonReader, String str) {
        return hnj(jsonReader, str, true);
    }

    private static bug<dse> hnj(JsonReader jsonReader, String str, boolean z10) {
        try {
            dse dseVarHnj = as.hnj(jsonReader);
            com.bytedance.adsdk.hn.qor.sk.hnj().hnj(str, dseVarHnj);
            return new bug<>(dseVarHnj);
        } catch (Exception e10) {
            return new bug<>((Throwable) e10);
        } finally {
            if (z10) {
                hnj(jsonReader);
            }
        }
    }

    public static void hnj(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    public static bug<dse> hnj(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return hn(context, zipInputStream, str);
        } finally {
            com.bytedance.adsdk.hn.dkl.dkl.hnj(zipInputStream);
        }
    }

    private static ta hnj(dse dseVar, String str) {
        for (ta taVar : dseVar.jip().values()) {
            if (taVar.ojm().equals(str)) {
                return taVar;
            }
        }
        return null;
    }

    private static orl<dse> hnj(final String str, Callable<bug<dse>> callable) {
        final dse dseVarHnj = str == null ? null : com.bytedance.adsdk.hn.qor.sk.hnj().hnj(str);
        if (dseVarHnj != null) {
            return new orl<>(new Callable<bug<dse>>() { // from class: com.bytedance.adsdk.hn.aq.7
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
                public bug<dse> call() {
                    return new bug<>(dseVarHnj);
                }
            });
        }
        if (str != null) {
            Map<String, orl<dse>> map = hnj;
            if (map.containsKey(str)) {
                return map.get(str);
            }
        }
        orl<dse> orlVar = new orl<>(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            orlVar.hnj(new dnm<dse>() { // from class: com.bytedance.adsdk.hn.aq.2
                @Override // com.bytedance.adsdk.hn.dnm
                public void hnj(dse dseVar) {
                    aq.hnj.remove(str);
                    atomicBoolean.set(true);
                    if (aq.hnj.size() == 0) {
                        aq.hn(true);
                    }
                }
            });
            orlVar.qor(new dnm<Throwable>() { // from class: com.bytedance.adsdk.hn.aq.3
                @Override // com.bytedance.adsdk.hn.dnm
                public void hnj(Throwable th2) {
                    aq.hnj.remove(str);
                    atomicBoolean.set(true);
                    if (aq.hnj.size() == 0) {
                        aq.hn(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                Map<String, orl<dse>> map2 = hnj;
                map2.put(str, orlVar);
                if (map2.size() == 1) {
                    hn(false);
                }
            }
        }
        return orlVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void hn(boolean z10) {
        ArrayList arrayList = new ArrayList(f11902hn);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList.get(i10);
        }
    }
}
