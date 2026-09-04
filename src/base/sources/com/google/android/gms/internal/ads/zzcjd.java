package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcjd extends zzcja {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcjd(zzchn zzchnVar) {
        super(zzchnVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfzk.zza().zza(cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (!file.isDirectory() && !this.zzg.mkdirs()) {
            String strValueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not create preload cache directory at ".concat(strValueOf));
            this.zzg = null;
            return;
        }
        if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
            return;
        }
        String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not set cache file permissions at ".concat(strValueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfzk.zza().zza(this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0448  */
    /* JADX WARN: Code duplicated, block: B:165:0x045a  */
    /* JADX WARN: Code duplicated, block: B:166:0x047e  */
    /* JADX WARN: Code duplicated, block: B:169:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:18:0x0069  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r33v0, types: [com.google.android.gms.internal.ads.zzcja, com.google.android.gms.internal.ads.zzcjd] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v38 */
    @Override // com.google.android.gms.internal.ads.zzcja
    public final boolean zze(final String str) {
        int i10;
        Object obj;
        File file;
        Object obj2;
        String str2;
        FileOutputStream fileOutputStream;
        ?? r11;
        ?? r10;
        Object obj3;
        ?? r12;
        int i11;
        ByteBuffer byteBuffer;
        int responseCode;
        boolean zDelete;
        String str3 = "Preloaded ";
        if (this.zzg == null) {
            zzq(str, null, "noCacheDir", null);
            return false;
        }
        while (true) {
            File file2 = this.zzg;
            if (file2 == null) {
                i10 = 0;
            } else {
                File[] fileArrListFiles = file2.listFiles();
                int length = fileArrListFiles.length;
                int i12 = 0;
                int i13 = 0;
                while (i12 < length) {
                    int i14 = i12;
                    int i15 = length;
                    if (!fileArrListFiles[i12].getName().endsWith(".done")) {
                        i13++;
                    }
                    i12 = i14 + 1;
                    length = i15;
                }
                i10 = i13;
            }
            String str4 = str3;
            if (i10 > ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzu)).intValue()) {
                File file3 = this.zzg;
                if (file3 == null) {
                    zDelete = false;
                } else {
                    File[] fileArrListFiles2 = file3.listFiles();
                    int length2 = fileArrListFiles2.length;
                    int i16 = 0;
                    long j10 = Long.MAX_VALUE;
                    File file4 = null;
                    while (i16 < length2) {
                        File file5 = fileArrListFiles2[i16];
                        int i17 = length2;
                        int i18 = i16;
                        if (!file5.getName().endsWith(".done")) {
                            long jLastModified = file5.lastModified();
                            if (jLastModified < j10) {
                                j10 = jLastModified;
                                file4 = file5;
                            }
                        }
                        i16 = i18 + 1;
                        length2 = i17;
                    }
                    if (file4 != null) {
                        zDelete = file4.delete();
                        File fileZza = zza(file4);
                        if (fileZza.isFile()) {
                            zDelete = fileZza.delete() & zDelete;
                        }
                    } else {
                        zDelete = false;
                    }
                }
                if (!zDelete) {
                    int i19 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to expire stream cache");
                    zzq(str, null, "expireFailed", null);
                    return false;
                }
                str3 = str4;
            } else {
                File file6 = new File(zzfzk.zza().zza(this.zzg, com.google.android.gms.ads.internal.util.client.zzf.zzg(str)));
                File fileZza2 = zza(file6);
                if (file6.isFile() && fileZza2.isFile()) {
                    int length3 = (int) file6.length();
                    String strValueOf = String.valueOf(str);
                    int i20 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Stream cache hit at ".concat(strValueOf));
                    zzo(str, file6.getAbsolutePath(), length3);
                    return true;
                }
                String strValueOf2 = String.valueOf(this.zzg.getAbsolutePath());
                String strValueOf3 = String.valueOf(str);
                Set set = zze;
                String strConcat = strValueOf2.concat(strValueOf3);
                synchronized (set) {
                    try {
                        if (set.contains(strConcat)) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36);
                            sb2.append("Stream cache already in progress at ");
                            sb2.append(str);
                            String string = sb2.toString();
                            int i21 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi(string);
                            zzq(str, file6.getAbsolutePath(), "inProgress", null);
                            return false;
                        }
                        set.add(strConcat);
                        try {
                            obj = "error";
                            try {
                                try {
                                    HttpURLConnection httpURLConnectionZzh = zzfzw.zza().zzh(new zzfzy() { // from class: com.google.android.gms.internal.ads.zzcjc
                                        @Override // com.google.android.gms.internal.ads.zzfzy
                                        public final /* synthetic */ URLConnection zza() throws IOException {
                                            int i22 = zzcjd.zzd;
                                            com.google.android.gms.ads.internal.zzt.zzq();
                                            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzan)).intValue();
                                            URL url = new URL(str);
                                            int i23 = 0;
                                            while (true) {
                                                i23++;
                                                if (i23 > 20) {
                                                    throw new IOException("Too many redirects (20)");
                                                }
                                                int i24 = zzfzr.zzb;
                                                URLConnection uRLConnectionOpenConnection = url.openConnection();
                                                uRLConnectionOpenConnection.setConnectTimeout(iIntValue);
                                                uRLConnectionOpenConnection.setReadTimeout(iIntValue);
                                                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                                                    throw new IOException("Invalid protocol.");
                                                }
                                                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                                                com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                                                zzlVar.zza(httpURLConnection, null);
                                                httpURLConnection.setInstanceFollowRedirects(false);
                                                int responseCode2 = httpURLConnection.getResponseCode();
                                                zzlVar.zzc(httpURLConnection, responseCode2);
                                                if (responseCode2 / 100 != 3) {
                                                    return httpURLConnection;
                                                }
                                                String headerField = httpURLConnection.getHeaderField("Location");
                                                if (headerField == null) {
                                                    throw new IOException("Missing Location header in redirect");
                                                }
                                                URL url2 = new URL(url, headerField);
                                                String protocol = url2.getProtocol();
                                                if (protocol == null) {
                                                    throw new IOException("Protocol is null");
                                                }
                                                if (!protocol.equals("http") && !protocol.equals("https")) {
                                                    throw new IOException("Unsupported scheme: ".concat(protocol));
                                                }
                                                String strConcat2 = "Redirecting to ".concat(headerField);
                                                int i25 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzd(strConcat2);
                                                httpURLConnection.disconnect();
                                                url = url2;
                                            }
                                        }
                                    }, 265, -1);
                                    if (httpURLConnectionZzh != null && (responseCode = httpURLConnectionZzh.getResponseCode()) >= 400) {
                                        try {
                                            String string2 = Integer.toString(responseCode);
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(string2).length() + 27);
                                            sb3.append("HTTP request failed. Code: ");
                                            sb3.append(string2);
                                            String string3 = sb3.toString();
                                            try {
                                                StringBuilder sb4 = new StringBuilder(String.valueOf(responseCode).length() + 21 + String.valueOf(str).length());
                                                sb4.append("HTTP status code ");
                                                sb4.append(responseCode);
                                                sb4.append(" at ");
                                                sb4.append(str);
                                                throw new IOException(sb4.toString());
                                            } catch (IOException | RuntimeException e10) {
                                                e = e10;
                                                obj3 = "badUrl";
                                                file = file6;
                                                str2 = string3;
                                                fileOutputStream = null;
                                                r10 = str2;
                                                r11 = obj3;
                                                if (e instanceof RuntimeException) {
                                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                }
                                                try {
                                                    fileOutputStream.close();
                                                } catch (IOException | NullPointerException unused) {
                                                }
                                                if (this.zzh) {
                                                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 26);
                                                    sb5.append("Preload aborted for URL \"");
                                                    sb5.append(str);
                                                    sb5.append("\"");
                                                    String string4 = sb5.toString();
                                                    int i22 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzh(string4);
                                                } else {
                                                    StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 25);
                                                    sb6.append("Preload failed for URL \"");
                                                    sb6.append(str);
                                                    sb6.append("\"");
                                                    String string5 = sb6.toString();
                                                    int i23 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzj(string5, e);
                                                }
                                                if (file.exists()) {
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                }
                                                zzq(str, file.getAbsolutePath(), r11, r10);
                                                zze.remove(strConcat);
                                                return false;
                                            }
                                        } catch (IOException | RuntimeException e11) {
                                            e = e11;
                                            obj2 = "badUrl";
                                            file = file6;
                                            str2 = null;
                                            obj3 = obj2;
                                            fileOutputStream = null;
                                            r10 = str2;
                                            r11 = obj3;
                                            if (e instanceof RuntimeException) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                            }
                                            fileOutputStream.close();
                                            if (this.zzh) {
                                                StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 26);
                                                sb7.append("Preload aborted for URL \"");
                                                sb7.append(str);
                                                sb7.append("\"");
                                                String string6 = sb7.toString();
                                                int i24 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzh(string6);
                                            } else {
                                                StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 25);
                                                sb8.append("Preload failed for URL \"");
                                                sb8.append(str);
                                                sb8.append("\"");
                                                String string7 = sb8.toString();
                                                int i25 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzj(string7, e);
                                            }
                                            if (file.exists()) {
                                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                            }
                                            zzq(str, file.getAbsolutePath(), r11, r10);
                                            zze.remove(strConcat);
                                            return false;
                                        }
                                    }
                                    int contentLength = httpURLConnectionZzh.getContentLength();
                                    if (contentLength < 0) {
                                        StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 55);
                                        sb9.append("Stream cache aborted, missing content-length header at ");
                                        sb9.append(str);
                                        String string8 = sb9.toString();
                                        int i26 = com.google.android.gms.ads.internal.util.zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzi(string8);
                                        zzq(str, file6.getAbsolutePath(), "contentLengthMissing", null);
                                        set.remove(strConcat);
                                        return false;
                                    }
                                    DecimalFormat decimalFormat = zzf;
                                    String str5 = decimalFormat.format(contentLength);
                                    int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzv)).intValue();
                                    if (contentLength > iIntValue) {
                                        StringBuilder sb10 = new StringBuilder(String.valueOf(str5).length() + 33 + String.valueOf(str).length());
                                        sb10.append("Content length ");
                                        sb10.append(str5);
                                        sb10.append(" exceeds limit at ");
                                        sb10.append(str);
                                        String string9 = sb10.toString();
                                        int i27 = com.google.android.gms.ads.internal.util.zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzi(string9);
                                        StringBuilder sb11 = new StringBuilder(String.valueOf(str5).length() + 40);
                                        sb11.append("File too big for full file cache. Size: ");
                                        sb11.append(str5);
                                        zzq(str, file6.getAbsolutePath(), "sizeExceeded", sb11.toString());
                                        set.remove(strConcat);
                                        return false;
                                    }
                                    StringBuilder sb12 = new StringBuilder(String.valueOf(str5).length() + 20 + String.valueOf(str).length());
                                    sb12.append("Caching ");
                                    sb12.append(str5);
                                    sb12.append(" bytes from ");
                                    sb12.append(str);
                                    String string10 = sb12.toString();
                                    int i28 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzd(string10);
                                    ReadableByteChannel readableByteChannelNewChannel = Channels.newChannel(httpURLConnectionZzh.getInputStream());
                                    file = file6;
                                    try {
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            try {
                                                FileChannel channel = fileOutputStream.getChannel();
                                                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                                                Clock clockZzk = com.google.android.gms.ads.internal.zzt.zzk();
                                                long jCurrentTimeMillis = clockZzk.currentTimeMillis();
                                                com.google.android.gms.ads.internal.util.zzbu zzbuVar = new com.google.android.gms.ads.internal.util.zzbu(((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzam)).longValue());
                                                long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbiq.zzal)).longValue();
                                                int i29 = 0;
                                                while (true) {
                                                    int i30 = readableByteChannelNewChannel.read(byteBufferAllocate);
                                                    if (i30 < 0) {
                                                        fileOutputStream.close();
                                                        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
                                                            String str6 = decimalFormat.format(i29);
                                                            StringBuilder sb13 = new StringBuilder(String.valueOf(str6).length() + 22 + String.valueOf(str).length());
                                                            sb13.append(str4);
                                                            sb13.append(str6);
                                                            sb13.append(" bytes from ");
                                                            sb13.append(str);
                                                            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb13.toString());
                                                        }
                                                        file.setReadable(true, false);
                                                        if (fileZza2.isFile()) {
                                                            fileZza2.setLastModified(System.currentTimeMillis());
                                                        } else {
                                                            try {
                                                                fileZza2.createNewFile();
                                                            } catch (IOException unused2) {
                                                            }
                                                        }
                                                        zzo(str, file.getAbsolutePath(), i29);
                                                        zze.remove(strConcat);
                                                        return true;
                                                    }
                                                    i29 += i30;
                                                    try {
                                                        try {
                                                            if (i29 > iIntValue) {
                                                                String string11 = Integer.toString(i29);
                                                                StringBuilder sb14 = new StringBuilder(String.valueOf(string11).length() + 40);
                                                                sb14.append("File too big for full file cache. Size: ");
                                                                sb14.append(string11);
                                                                sb14.toString();
                                                                throw new IOException("stream cache file size limit exceeded");
                                                            }
                                                            byteBufferAllocate.flip();
                                                            while (channel.write(byteBufferAllocate) > 0) {
                                                            }
                                                            byteBufferAllocate.clear();
                                                            if (clockZzk.currentTimeMillis() - jCurrentTimeMillis > 1000 * jLongValue) {
                                                                String string12 = Long.toString(jLongValue);
                                                                StringBuilder sb15 = new StringBuilder(String.valueOf(string12).length() + 29);
                                                                sb15.append("Timeout exceeded. Limit: ");
                                                                sb15.append(string12);
                                                                sb15.append(" sec");
                                                                sb15.toString();
                                                                throw new IOException("stream cache time limit exceeded");
                                                            }
                                                            if (this.zzh) {
                                                                throw new IOException("abort requested");
                                                            }
                                                            if (zzbuVar.zza()) {
                                                                byteBuffer = byteBufferAllocate;
                                                                i11 = contentLength;
                                                                com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzciu(this, str, file.getAbsolutePath(), i29, i11, false));
                                                            } else {
                                                                i11 = contentLength;
                                                                byteBuffer = byteBufferAllocate;
                                                            }
                                                            contentLength = i11;
                                                            zzbuVar = zzbuVar;
                                                            byteBufferAllocate = byteBuffer;
                                                            readableByteChannelNewChannel = readableByteChannelNewChannel;
                                                        } catch (IOException | RuntimeException e12) {
                                                            e = e12;
                                                            r10 = channel;
                                                            fileOutputStream = fileOutputStream;
                                                            r11 = iIntValue;
                                                        }
                                                    } catch (IOException | RuntimeException e13) {
                                                        e = e13;
                                                        r12 = iIntValue;
                                                    }
                                                    r10 = 0;
                                                    r11 = r12;
                                                    if (e instanceof RuntimeException) {
                                                        com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                                    }
                                                    fileOutputStream.close();
                                                    if (this.zzh) {
                                                        StringBuilder sb16 = new StringBuilder(String.valueOf(str).length() + 26);
                                                        sb16.append("Preload aborted for URL \"");
                                                        sb16.append(str);
                                                        sb16.append("\"");
                                                        String string13 = sb16.toString();
                                                        int i210 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzh(string13);
                                                    } else {
                                                        StringBuilder sb17 = new StringBuilder(String.valueOf(str).length() + 25);
                                                        sb17.append("Preload failed for URL \"");
                                                        sb17.append(str);
                                                        sb17.append("\"");
                                                        String string14 = sb17.toString();
                                                        int i211 = com.google.android.gms.ads.internal.util.zze.zza;
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzj(string14, e);
                                                    }
                                                    if (file.exists() && !file.delete()) {
                                                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                                    }
                                                    zzq(str, file.getAbsolutePath(), r11, r10);
                                                    zze.remove(strConcat);
                                                    return false;
                                                }
                                            } catch (IOException e14) {
                                                e = e14;
                                                r12 = obj;
                                            }
                                        } catch (RuntimeException e15) {
                                            e = e15;
                                            r12 = obj;
                                        }
                                    } catch (IOException e16) {
                                        e = e16;
                                        obj2 = obj;
                                        str2 = null;
                                        obj3 = obj2;
                                        fileOutputStream = null;
                                        r10 = str2;
                                        r11 = obj3;
                                    } catch (RuntimeException e17) {
                                        e = e17;
                                        obj2 = obj;
                                        str2 = null;
                                        obj3 = obj2;
                                        fileOutputStream = null;
                                        r10 = str2;
                                        r11 = obj3;
                                    }
                                } catch (IOException | RuntimeException e18) {
                                    e = e18;
                                    file = file6;
                                }
                            } catch (IOException e19) {
                                e = e19;
                                file = file6;
                                obj2 = obj;
                                str2 = null;
                                obj3 = obj2;
                                fileOutputStream = null;
                                r10 = str2;
                                r11 = obj3;
                                if (e instanceof RuntimeException) {
                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                }
                                fileOutputStream.close();
                                if (this.zzh) {
                                    StringBuilder sb18 = new StringBuilder(String.valueOf(str).length() + 26);
                                    sb18.append("Preload aborted for URL \"");
                                    sb18.append(str);
                                    sb18.append("\"");
                                    String string15 = sb18.toString();
                                    int i212 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzh(string15);
                                } else {
                                    StringBuilder sb19 = new StringBuilder(String.valueOf(str).length() + 25);
                                    sb19.append("Preload failed for URL \"");
                                    sb19.append(str);
                                    sb19.append("\"");
                                    String string16 = sb19.toString();
                                    int i213 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj(string16, e);
                                }
                                if (file.exists()) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                }
                                zzq(str, file.getAbsolutePath(), r11, r10);
                                zze.remove(strConcat);
                                return false;
                            } catch (RuntimeException e20) {
                                e = e20;
                                file = file6;
                                obj2 = obj;
                                str2 = null;
                                obj3 = obj2;
                                fileOutputStream = null;
                                r10 = str2;
                                r11 = obj3;
                                if (e instanceof RuntimeException) {
                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "VideoStreamFullFileCache.preload");
                                }
                                fileOutputStream.close();
                                if (this.zzh) {
                                    StringBuilder sb110 = new StringBuilder(String.valueOf(str).length() + 26);
                                    sb110.append("Preload aborted for URL \"");
                                    sb110.append(str);
                                    sb110.append("\"");
                                    String string17 = sb110.toString();
                                    int i214 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzh(string17);
                                } else {
                                    StringBuilder sb111 = new StringBuilder(String.valueOf(str).length() + 25);
                                    sb111.append("Preload failed for URL \"");
                                    sb111.append(str);
                                    sb111.append("\"");
                                    String string18 = sb111.toString();
                                    int i215 = com.google.android.gms.ads.internal.util.zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzj(string18, e);
                                }
                                if (file.exists()) {
                                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not delete partial cache file at ".concat(String.valueOf(file.getAbsolutePath())));
                                }
                                zzq(str, file.getAbsolutePath(), r11, r10);
                                zze.remove(strConcat);
                                return false;
                            }
                        } catch (IOException | RuntimeException e21) {
                            e = e21;
                            obj = "error";
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcja
    public final void zzl() {
        this.zzh = true;
    }
}
