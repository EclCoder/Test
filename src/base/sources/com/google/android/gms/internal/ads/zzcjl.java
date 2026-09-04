package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import com.mbridge.msdk.foundation.download.Command;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzcjl extends zzhh implements zzii {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzih zzg;
    private zzht zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    zzcjl(String str, zzin zzinVar, int i10, int i11, int i12) {
        super(true);
        this.zzc = new zzcjk(this);
        this.zzr = new HashSet();
        zzdg.zza(str);
        this.zzf = str;
        this.zzg = new zzih();
        this.zzd = i10;
        this.zze = i11;
        this.zzq = i12;
        if (zzinVar != null) {
            zze(zzinVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected error while disconnecting", e10);
            }
            this.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws zzie {
        try {
            if (this.zzo != this.zzm) {
                AtomicReference atomicReference = zzb;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j10 = this.zzo;
                    long j11 = this.zzm;
                    if (j10 == j11) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i12 = this.zzj.read(bArr2, 0, (int) Math.min(j11 - j10, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i12 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += (long) i12;
                    zzh(i12);
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.zzn;
            if (j12 != -1) {
                long j13 = j12 - this.zzp;
                if (j13 == 0) {
                    return -1;
                }
                i11 = (int) Math.min(i11, j13);
            }
            int i13 = this.zzj.read(bArr, i10, i11);
            if (i13 == -1) {
                if (this.zzn == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.zzp += (long) i13;
            zzh(i13);
            return i13;
        } catch (IOException e10) {
            throw new zzie(e10, this.zzh, 2000, 2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzhp
    public final void zzd() {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new zzie(e10, this.zzh, 2000, 3);
                }
            }
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
        } catch (Throwable th2) {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzi();
            }
            this.zzr.clear();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhp, com.google.android.gms.internal.ads.zzii
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    final void zzk(int i10) {
        this.zzq = i10;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e10) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to update receive buffer size.", e10);
                }
            }
        }
    }

    final /* synthetic */ void zzl(Socket socket) {
        this.zzr.add(socket);
    }

    final /* synthetic */ int zzm() {
        return this.zzq;
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00df A[Catch: IOException -> 0x0044, TryCatch #2 {IOException -> 0x0044, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0047, B:12:0x005f, B:14:0x0065, B:21:0x0092, B:23:0x00b2, B:24:0x00d1, B:25:0x00d6, B:27:0x00df, B:28:0x00e6, B:41:0x010f, B:94:0x0282, B:96:0x028f, B:98:0x02a0, B:101:0x02a9, B:102:0x02b6, B:104:0x02c0, B:105:0x02c8, B:106:0x02c9, B:107:0x02e6), top: B:114:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0129  */
    /* JADX WARN: Code duplicated, block: B:96:0x028f A[Catch: IOException -> 0x0044, TryCatch #2 {IOException -> 0x0044, blocks: (B:3:0x000e, B:4:0x0025, B:6:0x002d, B:8:0x003b, B:11:0x0047, B:12:0x005f, B:14:0x0065, B:21:0x0092, B:23:0x00b2, B:24:0x00d1, B:25:0x00d6, B:27:0x00df, B:28:0x00e6, B:41:0x010f, B:94:0x0282, B:96:0x028f, B:98:0x02a0, B:101:0x02a9, B:102:0x02b6, B:104:0x02c0, B:105:0x02c8, B:106:0x02c9, B:107:0x02e6), top: B:114:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzhp
    public final long zzb(zzht zzhtVar) throws zzie {
        long j10;
        int responseCode;
        String headerField;
        String protocol;
        long j11;
        long jMax;
        this.zzh = zzhtVar;
        long j12 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzhtVar.zza.toString());
            long j13 = zzhtVar.zze;
            long j14 = zzhtVar.zzf;
            boolean zZza = zzhtVar.zza(1);
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                long j15 = j12;
                if (i10 > 20) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 20);
                    sb2.append("Too many redirects: ");
                    sb2.append(i11);
                    throw new NoRouteToHostException(sb2.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (Map.Entry entry : this.zzg.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    j13 = j13;
                }
                long j16 = j13;
                if (j16 == j15) {
                    if (j14 != -1) {
                        j10 = j15;
                    }
                    httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.zzf);
                    if (!zZza) {
                        httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzi = httpURLConnection;
                        try {
                            int responseCode2 = httpURLConnection.getResponseCode();
                            this.zzl = responseCode2;
                            if (responseCode2 < 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                zzig zzigVar = new zzig(this.zzl, null, null, headerFields, zzhtVar, zzfl.zzb);
                                if (this.zzl != 416) {
                                    throw zzigVar;
                                }
                                zzigVar.initCause(new zzhq(2008));
                                throw zzigVar;
                            }
                            if (responseCode2 == 200) {
                                j11 = zzhtVar.zze;
                                if (j11 == j15) {
                                    j11 = j15;
                                }
                            } else {
                                j11 = j15;
                            }
                            this.zzm = j11;
                            if (zzhtVar.zza(1)) {
                                this.zzn = zzhtVar.zzf;
                            } else {
                                long j17 = zzhtVar.zzf;
                                if (j17 != -1) {
                                    this.zzn = j17;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzi;
                                    String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                    if (TextUtils.isEmpty(headerField2)) {
                                        jMax = -1;
                                    } else {
                                        try {
                                            jMax = Long.parseLong(headerField2);
                                        } catch (NumberFormatException unused) {
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(headerField2).length() + 28);
                                            sb3.append("Unexpected Content-Length [");
                                            sb3.append(headerField2);
                                            sb3.append("]");
                                            String string = sb3.toString();
                                            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzf(string);
                                            jMax = -1;
                                        }
                                    }
                                    String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        Matcher matcher = zza.matcher(headerField3);
                                        if (matcher.find()) {
                                            try {
                                                long j18 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (jMax < j15) {
                                                    jMax = j18;
                                                } else if (jMax != j18) {
                                                    StringBuilder sb4 = new StringBuilder(String.valueOf(headerField2).length() + 25 + String.valueOf(headerField3).length() + 1);
                                                    sb4.append("Inconsistent headers [");
                                                    sb4.append(headerField2);
                                                    sb4.append("] [");
                                                    sb4.append(headerField3);
                                                    sb4.append("]");
                                                    String string2 = sb4.toString();
                                                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzi(string2);
                                                    jMax = Math.max(jMax, j18);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                StringBuilder sb5 = new StringBuilder(String.valueOf(headerField3).length() + 27);
                                                sb5.append("Unexpected Content-Range [");
                                                sb5.append(headerField3);
                                                sb5.append("]");
                                                String string3 = sb5.toString();
                                                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzf(string3);
                                            }
                                        }
                                    }
                                    this.zzn = jMax != -1 ? jMax - this.zzm : -1L;
                                }
                            }
                            try {
                                this.zzj = this.zzi.getInputStream();
                                this.zzk = true;
                                zzg(zzhtVar);
                                return this.zzn;
                            } catch (IOException e10) {
                                zzn();
                                throw new zzie(e10, zzhtVar, 2000, 1);
                            }
                        } catch (IOException e11) {
                            zzn();
                            throw new zzie("Unable to connect to ".concat(String.valueOf(zzhtVar.zza.toString())), e11, zzhtVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException(dOIDCKnIR.AUwRGiNWpOsWU);
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i10 = i11;
                    j12 = j15;
                    j13 = j16;
                } else {
                    j10 = j16;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j10).length() + 7);
                sb6.append("bytes=");
                sb6.append(j10);
                sb6.append("-");
                String string4 = sb6.toString();
                if (j14 != -1) {
                    long j19 = (j10 + j14) - 1;
                    StringBuilder sb7 = new StringBuilder(string4.length() + String.valueOf(j19).length());
                    sb7.append(string4);
                    sb7.append(j19);
                    string4 = sb7.toString();
                }
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, string4);
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.zzf);
                if (!zZza) {
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 300) {
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException(dOIDCKnIR.AUwRGiNWpOsWU);
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!"https".equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i10 = i11;
                j12 = j15;
                j13 = j16;
            }
        } catch (IOException e12) {
            throw new zzie("Unable to connect to ".concat(String.valueOf(zzhtVar.zza.toString())), e12, zzhtVar, 2000, 1);
        }
    }
}
