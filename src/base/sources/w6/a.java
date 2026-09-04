package w6;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static int a(File file) throws Throwable {
        if (file != null && file.exists()) {
            long length = file.length();
            if (length <= 0) {
                return -1;
            }
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[8];
                    long j10 = 0;
                    while (fileInputStream2.read(bArr) == 8) {
                        long j11 = ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (255 & ((long) bArr[3]));
                        if (bArr[4] != 109 || bArr[5] != 111 || bArr[6] != 111 || bArr[7] != 118) {
                            long j12 = j11 - 8;
                            if (j12 > 0 && fileInputStream2.skip(j12) < j12) {
                                break;
                            }
                            j10 += j11;
                        } else {
                            break;
                        }
                    }
                    int i10 = (int) ((j10 * 100.0f) / length);
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused) {
                    }
                    return i10;
                } catch (Exception unused2) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    return -1;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception unused5) {
            } catch (Throwable th3) {
                th = th3;
            }
        }
        return -1;
    }

    public static int b(String str) {
        MediaExtractor mediaExtractor;
        try {
            mediaExtractor = new MediaExtractor();
            try {
                mediaExtractor.setDataSource(str);
                int trackCount = mediaExtractor.getTrackCount();
                for (int i10 = 0; i10 < trackCount; i10++) {
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i10);
                    String string = trackFormat.getString("mime");
                    if (string != null && ((MimeTypes.VIDEO_H264.equals(string) || MimeTypes.VIDEO_H265.equals(string)) && trackFormat.containsKey("level"))) {
                        int integer = trackFormat.getInteger("level");
                        mediaExtractor.release();
                        return integer;
                    }
                }
            } catch (Throwable unused) {
                if (mediaExtractor == null) {
                    return -1;
                }
            }
        } catch (Throwable unused2) {
            mediaExtractor = null;
        }
        mediaExtractor.release();
        return -1;
    }

    private static String c(int i10) {
        for (Field field : MediaCodecInfo.CodecProfileLevel.class.getFields()) {
            String name = field.getName();
            if (field.getType() == Integer.TYPE && name.contains("HEVC")) {
                try {
                    if (field.getInt(null) == i10) {
                        return name;
                    }
                } catch (IllegalAccessException unused) {
                    continue;
                }
            }
        }
        return String.valueOf(i10);
    }

    public static JSONArray d() {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        HashSet hashSet = new HashSet();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(1).getCodecInfos()) {
            if (!mediaCodecInfo.isEncoder() && (Build.VERSION.SDK_INT < 29 || !mediaCodecInfo.isAlias())) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equals(MimeTypes.VIDEO_H265) && (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(MimeTypes.VIDEO_H265)) != null) {
                        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                            hashSet.add(c(codecProfileLevel.level));
                        }
                    }
                }
            }
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            jSONArray.put((String) it.next());
        }
        return jSONArray;
    }
}
