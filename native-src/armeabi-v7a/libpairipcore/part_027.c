// ============================================================
// Decompiled by Ghidra
// Program: libpairipcore.so
// Functions: 521-540
// ============================================================

// ============================================================
// Function #521
// Name: FUN_000269a8
// Address: 000269a8
// JNI: NO
// ============================================================


void FUN_000269a8(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_0001ad48((int)&DAT_000269b4 + DAT_000269b4);
}




// ============================================================
// Function #522
// Name: FUN_000269b8
// Address: 000269b8
// JNI: NO
// ============================================================


void FUN_000269b8(int param_1,uint param_2)

{
  uint uVar1;
  int iVar2;
  uint extraout_r2;
  uint extraout_r2_00;
  uint extraout_r2_01;
  int extraout_r3;
  int extraout_r3_00;
  undefined4 extraout_r3_01;
  int iVar3;
  uint uVar4;
  uint uVar5;
  bool bVar6;
  
  uVar4 = *(int *)(param_1 + 0x10) - 1;
  if (*(int *)(param_1 + 0x18) == 0x101) {
    uVar1 = *(uint *)(param_1 + 0x20) ^ uVar4 | *(uint *)(param_1 + 0x24) ^ (int)uVar4 >> 0x1f;
    bVar6 = uVar1 == 0;
    if (bVar6) {
      uVar1 = *(uint *)(param_1 + 0x14);
    }
    if (bVar6 && uVar1 == 0x7fffffff) {
      uVar1 = *(uint *)(param_1 + 0x28);
      iVar2 = *(int *)(param_1 + 0x2c);
      goto LAB_00026a5c;
    }
  }
  iVar2 = 0;
  uVar1 = 1;
  for (uVar5 = uVar4; uVar5 != 0; uVar5 = uVar5 - 1) {
    FUN_00026034((int)((ulonglong)uVar1 * 0x101),
                 (int)((ulonglong)uVar1 * 0x101 >> 0x20) + iVar2 * 0x101,0x7fffffff,0);
    iVar2 = extraout_r3;
    uVar1 = extraout_r2;
  }
  *(undefined4 *)(param_1 + 0x14) = 0x7fffffff;
  *(undefined4 *)(param_1 + 0x18) = 0x101;
  *(uint *)(param_1 + 0x20) = uVar4;
  *(int *)(param_1 + 0x24) = (int)uVar4 >> 0x1f;
  *(uint *)(param_1 + 0x28) = uVar1;
  *(int *)(param_1 + 0x2c) = iVar2;
LAB_00026a5c:
  iVar3 = *(int *)(param_1 + 0xc);
  *(uint *)(param_1 + 0x10) = uVar4;
  uVar5 = *(uint *)(param_1 + 8);
  FUN_00026034((int)((ulonglong)param_2 * (ulonglong)uVar1),
               iVar2 * param_2 + (int)((ulonglong)param_2 * (ulonglong)uVar1 >> 0x20),0x7fffffff,0);
  uVar4 = uVar5 - extraout_r2_00;
  FUN_00026034(uVar4 + 0x7fffffff,
               (iVar3 - (extraout_r3_00 + (uint)(uVar5 < extraout_r2_00))) +
               (uint)(0x80000000 < uVar4),0x7fffffff,0);
  *(uint *)(param_1 + 8) = extraout_r2_01;
  *(undefined4 *)(param_1 + 0xc) = extraout_r3_01;
  return;
}




// ============================================================
// Function #523
// Name: FUN_00026ab0
// Address: 00026ab0
// JNI: NO
// ============================================================


void FUN_00026ab0(undefined4 param_1)

{
  FUN_00023f68(param_1,0x30);
  return;
}




// ============================================================
// Function #524
// Name: FUN_00026ab8
// Address: 00026ab8
// JNI: NO
// ============================================================


void FUN_00026ab8(int param_1,undefined4 param_2)

{
  longlong lVar1;
  undefined4 extraout_r2;
  undefined4 extraout_r3;
  
  lVar1 = (ulonglong)*(uint *)(param_1 + 8) * 0x101 +
          CONCAT44(*(int *)(param_1 + 0xc) * 0x101,param_2);
  *(int *)(param_1 + 0x10) = *(int *)(param_1 + 0x10) + 1;
  FUN_00026034((int)lVar1,(int)((ulonglong)lVar1 >> 0x20),0x7fffffff,0);
  *(undefined4 *)(param_1 + 8) = extraout_r2;
  *(undefined4 *)(param_1 + 0xc) = extraout_r3;
  return;
}




// ============================================================
// Function #525
// Name: FUN_00026b08
// Address: 00026b08
// JNI: NO
// ============================================================


void FUN_00026b08(void)

{
                    /* WARNING: Subroutine does not return */
  FUN_00026960((int)&DAT_00026b14 + DAT_00026b14);
}




// ============================================================
// Function #526
// Name: FUN_00026b18
// Address: 00026b18
// JNI: NO
// ============================================================


void FUN_00026b18(int *param_1,undefined4 param_2)

{
  undefined8 *puVar1;
  uint uVar2;
  uint uVar3;
  undefined8 *puVar4;
  int iVar5;
  uint uVar6;
  undefined4 *puVar7;
  undefined8 *puVar8;
  undefined8 *puVar9;
  undefined8 *puVar10;
  int iVar11;
  undefined8 *puVar12;
  uint uVar13;
  undefined8 uVar14;
  undefined8 uVar15;
  
  puVar10 = (undefined8 *)param_1[2];
  if (puVar10 != (undefined8 *)param_1[3]) goto LAB_00026c80;
  puVar8 = (undefined8 *)*param_1;
  puVar9 = (undefined8 *)param_1[1];
  if (puVar8 < puVar9) {
    iVar5 = (int)puVar10 - (int)puVar9;
    iVar11 = (((int)puVar9 - (int)puVar8 >> 2) + 1) / 2;
    puVar7 = (undefined4 *)((int)puVar9 + iVar11 * -4);
    if (iVar5 != 0) {
      __aeabi_memmove4(puVar7,puVar9,iVar5);
      puVar9 = (undefined8 *)param_1[1];
    }
    puVar10 = (undefined8 *)((int)puVar7 + iVar5);
    param_1[1] = (int)((int)puVar9 + iVar11 * -4);
    param_1[2] = (int)puVar10;
    goto LAB_00026c80;
  }
  iVar11 = (int)puVar10 - (int)puVar8;
  uVar6 = iVar11 >> 1;
  if (iVar11 == 0) {
    uVar6 = 1;
  }
  if (0x3fffffff < uVar6) {
                    /* WARNING: Subroutine does not return */
    FUN_00026984();
  }
  iVar5 = FUN_000a0370(uVar6 << 2);
  puVar12 = (undefined8 *)(iVar5 + (uVar6 & 0xfffffffc));
  puVar1 = puVar12;
  if (puVar10 != puVar9) {
    puVar1 = (undefined8 *)((int)puVar12 + ((int)puVar10 - (int)puVar9));
    uVar2 = ((int)puVar10 - (int)puVar9) - 4;
    puVar10 = puVar12;
    if ((0x1b < uVar2) && (0xf < ((uVar6 & 0x3ffffffc) + iVar5) - (int)puVar9)) {
      uVar3 = (uVar2 >> 2) + 1;
      uVar13 = uVar3 & 0xfffffffc;
      uVar2 = uVar13;
      puVar4 = puVar9;
      do {
        uVar14 = *puVar4;
        uVar15 = puVar4[1];
        puVar4 = puVar4 + 2;
        uVar2 = uVar2 - 4;
        *puVar10 = uVar14;
        puVar10[1] = uVar15;
        puVar10 = puVar10 + 2;
      } while (uVar2 != 0);
      if (uVar3 == uVar13) goto LAB_00026c5c;
      puVar9 = (undefined8 *)((int)puVar9 + uVar13 * 4);
      puVar10 = (undefined8 *)((int)puVar12 + uVar13 * 4);
    }
    do {
      puVar4 = (undefined8 *)((int)puVar10 + 4);
      *(undefined4 *)puVar10 = *(undefined4 *)puVar9;
      puVar10 = puVar4;
      puVar9 = (undefined8 *)((int)puVar9 + 4);
    } while (puVar4 != puVar1);
  }
LAB_00026c5c:
  puVar10 = puVar1;
  *param_1 = iVar5;
  param_1[1] = (int)puVar12;
  param_1[2] = (int)puVar10;
  param_1[3] = iVar5 + uVar6 * 4;
  if (puVar8 != (undefined8 *)0x0) {
    FUN_00023f68(puVar8,iVar11);
    puVar10 = (undefined8 *)param_1[2];
  }
LAB_00026c80:
  *(undefined4 *)puVar10 = param_2;
  param_1[2] = param_1[2] + 4;
  return;
}




// ============================================================
// Function #527
// Name: FUN_00026c9c
// Address: 00026c9c
// JNI: NO
// ============================================================


int * FUN_00026c9c(int *param_1)

{
  int iVar1;
  int *piVar2;
  uint uVar3;
  bool bVar4;
  
  if (-1 < *param_1) {
    piVar2 = (int *)FUN_00025e6c(DAT_00026d04 + 0x26cbc);
    do {
      uVar3 = FUN_00019718(6,*param_1);
      if (0xfffff000 < uVar3) {
        iVar1 = -uVar3;
        bVar4 = uVar3 != 0xfffffffc;
        uVar3 = 0;
        if (bVar4) {
          uVar3 = 0xffffffff;
        }
        *piVar2 = iVar1;
      }
    } while ((0x7fffffff < uVar3) && (*piVar2 == 4));
  }
  return param_1;
}




// ============================================================
// Function #528
// Name: _INIT_0
// Address: 00026d08
// JNI: NO
// ============================================================


void _INIT_0(void)

{
  undefined1 *local_128;
  undefined1 *local_124;
  undefined1 auStack_120 [8];
  undefined1 auStack_118 [260];
  int local_14;
  
  local_14 = **(int **)(DAT_00026d78 + 0x26d2c);
  __aeabi_memcpy8(auStack_120,DAT_00026d74 + 0x26d28,0x108);
  local_124 = auStack_118;
  local_128 = auStack_120;
  FUN_00026e50(&local_128);
  if (**(int **)(DAT_00026d7c + 0x26d60) != local_14) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #529
// Name: _INIT_1
// Address: 00026d80
// JNI: NO
// ============================================================


void _INIT_1(void)

{
  undefined1 *local_128;
  undefined1 *local_124;
  undefined1 auStack_120 [8];
  undefined1 auStack_118 [260];
  int local_14;
  
  local_14 = **(int **)(DAT_00026df0 + 0x26da4);
  __aeabi_memcpy8(auStack_120,DAT_00026dec + 0x26da0,0x108);
  local_124 = auStack_118;
  local_128 = auStack_120;
  FUN_00028408(&local_128);
  if (**(int **)(DAT_00026df4 + 0x26dd8) != local_14) {
                    /* WARNING: Subroutine does not return */
    __stack_chk_fail();
  }
  return;
}




// ============================================================
// Function #530
// Name: _INIT_2
// Address: 00026df8
// JNI: NO
// ============================================================


void _INIT_2(void)

{
  (*(code *)PTR___cxa_atexit_000a5e98)
            (*(undefined4 *)((int)&DAT_00026e18 + DAT_00026e20),(int)&DAT_00026e1c + DAT_00026e18,
             DAT_00026e1c + 0x26e14);
  return;
}




// ============================================================
// Function #531
// Name: _INIT_3
// Address: 00026e24
// JNI: NO
// ============================================================


void _INIT_3(void)

{
  (*(code *)PTR___cxa_atexit_000a5e98)
            (*(undefined4 *)((int)&DAT_00026e44 + DAT_00026e4c),DAT_00026e44 + 0x26e3c,
             DAT_00026e48 + 0x26e40);
  return;
}




// ============================================================
// Function #532
// Name: FUN_00026e50
// Address: 00026e50
// JNI: NO
// ============================================================


void FUN_00026e50(undefined4 *param_1)

{
  byte bVar1;
  byte bVar2;
  byte *pbVar3;
  uint local_11c;
  undefined1 auStack_114 [256];
  int local_14;
  
  local_14 = **(int **)(DAT_00026f1c + 0x26e74);
  for (local_11c = 0; local_11c < 0x100; local_11c = local_11c + 1) {
    pbVar3 = (byte *)FUN_00026f24(param_1[1],local_11c);
    bVar1 = *pbVar3;
    pbVar3 = (byte *)FUN_00026f2c(*param_1,local_11c & 7);
    bVar2 = *pbVar3;
    pbVar3 = (byte *)FUN_00026f34(auStack_114,local_11c);
    *pbVar3 = bVar1 ^ bVar2;
  }
  FUN_00026f3c(auStack_114);
  if (**(int **)(DAT_00026f20 + 0x26efc) == local_14) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #533
// Name: FUN_00026f24
// Address: 00026f24
// JNI: NO
// ============================================================


int FUN_00026f24(int param_1,int param_2)

{
  return param_1 + param_2;
}




// ============================================================
// Function #534
// Name: FUN_00026f2c
// Address: 00026f2c
// JNI: NO
// ============================================================


int FUN_00026f2c(int param_1,int param_2)

{
  return param_1 + param_2;
}




// ============================================================
// Function #535
// Name: FUN_00026f34
// Address: 00026f34
// JNI: NO
// ============================================================


int FUN_00026f34(int param_1,int param_2)

{
  return param_1 + param_2;
}




// ============================================================
// Function #536
// Name: FUN_00026f3c
// Address: 00026f3c
// JNI: NO
// ============================================================


void FUN_00026f3c(undefined4 param_1)

{
  __aeabi_memcpy((int)&DAT_00026f50 + DAT_00026f50,param_1,0x100);
  return;
}




// ============================================================
// Function #537
// Name: FUN_00026f54
// Address: 00026f54
// JNI: NO
// ============================================================


void FUN_00026f54(byte *param_1,uint *param_2,undefined8 *param_3,int param_4)

{
  byte bVar1;
  byte bVar2;
  byte bVar3;
  byte bVar4;
  byte bVar5;
  byte bVar6;
  byte bVar7;
  byte bVar8;
  byte bVar9;
  byte bVar10;
  byte bVar11;
  byte bVar12;
  byte bVar13;
  byte bVar14;
  byte bVar15;
  byte bVar16;
  byte bVar17;
  uint uVar18;
  byte *pbVar19;
  int iVar20;
  uint uVar21;
  uint uVar22;
  uint uVar23;
  int iVar24;
  byte bVar25;
  undefined8 uVar26;
  
  if (param_4 == 0x10) {
    uVar26 = param_3[1];
    *(undefined8 *)param_2 = *param_3;
    *(undefined8 *)(param_2 + 2) = uVar26;
    uVar18 = param_2[6] ^ param_2[1];
    uVar22 = param_2[7] ^ param_2[2];
    uVar23 = param_2[8] ^ param_2[3];
    uVar21 = param_2[5] ^ *param_2;
    iVar20 = 0;
    do {
      iVar24 = DAT_00027378 + 0x27230;
      bVar1 = *(byte *)(iVar24 + ((uVar21 & 0xffffff) >> 0x10));
      bVar2 = *(byte *)(iVar24 + ((uVar22 & 0xffffff) >> 0x10));
      bVar3 = *(byte *)(iVar24 + ((uVar21 & 0xffff) >> 8));
      bVar4 = *(byte *)(iVar24 + ((uVar23 & 0xffff) >> 8));
      bVar5 = *(byte *)(iVar24 + ((uVar22 & 0xffff) >> 8));
      bVar6 = *(byte *)(iVar24 + ((uVar18 & 0xffff) >> 8));
      bVar7 = *(byte *)(iVar24 + (uVar23 & 0xff));
      bVar8 = *(byte *)(iVar24 + (uVar22 & 0xff));
      bVar9 = *(byte *)(iVar24 + (uVar18 & 0xff));
      bVar10 = *(byte *)(iVar24 + (uVar21 & 0xff));
      *(byte *)(param_2 + 3) = bVar7;
      *(byte *)param_2 = bVar10;
      *(byte *)(param_2 + 1) = bVar9;
      *(byte *)(param_2 + 2) = bVar8;
      *(byte *)((int)param_2 + 1) = bVar6;
      *(byte *)((int)param_2 + 5) = bVar5;
      *(byte *)((int)param_2 + 9) = bVar4;
      *(byte *)((int)param_2 + 0xd) = bVar3;
      *(byte *)((int)param_2 + 2) = bVar2;
      bVar25 = *(byte *)(iVar24 + (uVar22 >> 0x18));
      bVar11 = *(byte *)(iVar24 + (uVar18 >> 0x18));
      bVar12 = *(byte *)(iVar24 + (uVar23 >> 0x18));
      bVar13 = *(byte *)(iVar24 + ((uVar18 & 0xffffff) >> 0x10));
      bVar14 = *(byte *)(iVar24 + (uVar21 >> 0x18));
      bVar15 = *(byte *)(iVar24 + ((uVar23 & 0xffffff) >> 0x10));
      *(byte *)((int)param_2 + 10) = bVar1;
      *(byte *)((int)param_2 + 6) = bVar15;
      *(byte *)((int)param_2 + 0xe) = bVar13;
      *(byte *)((int)param_2 + 3) = bVar12;
      *(byte *)((int)param_2 + 0xf) = bVar25;
      *(byte *)((int)param_2 + 0xb) = bVar11;
      *(byte *)((int)param_2 + 7) = bVar14;
      if (iVar20 == 0x90) {
        bVar25 = (byte)(uVar21 >> 0x18);
      }
      else {
        bVar16 = bVar3 ^ bVar7;
        bVar25 = bVar16 ^ bVar13 ^ bVar25;
        bVar7 = (byte)((uint)(int)(char)bVar16 >> 7) & 0x1b ^ bVar16 << 1 ^ bVar7;
        *(byte *)(param_2 + 3) = bVar7 ^ bVar25;
        bVar13 = bVar4 ^ bVar8;
        bVar8 = (byte)((uint)(int)(char)bVar13 >> 7) & 0x1b ^ bVar13 << 1 ^ bVar8;
        bVar13 = bVar13 ^ bVar1 ^ bVar11;
        *(byte *)(param_2 + 2) = bVar8 ^ bVar13;
        bVar16 = bVar5 ^ bVar9;
        bVar9 = (byte)((uint)(int)(char)bVar16 >> 7) & 0x1b ^ bVar16 << 1 ^ bVar9;
        bVar16 = bVar16 ^ bVar15 ^ bVar14;
        *(byte *)(param_2 + 1) = bVar9 ^ bVar16;
        bVar17 = bVar6 ^ bVar10;
        bVar10 = (byte)((uint)(int)(char)bVar17 >> 7) & 0x1b ^ bVar17 << 1 ^ bVar10;
        bVar17 = bVar17 ^ bVar2 ^ bVar12;
        *(byte *)param_2 = bVar10 ^ bVar17;
        bVar4 = (byte)((uint)(int)(char)(bVar1 ^ bVar4) >> 7) & 0x1b ^ (bVar1 ^ bVar4) << 1 ^ bVar13
                ^ bVar4;
        *(byte *)((int)param_2 + 9) = bVar4;
        bVar1 = (byte)((uint)(int)(char)(bVar11 ^ bVar1) >> 7) & 0x1b ^ (bVar11 ^ bVar1) << 1 ^
                bVar13 ^ bVar1;
        *(byte *)((int)param_2 + 10) = bVar1;
        *(byte *)((int)param_2 + 0xb) = bVar8 ^ bVar4 ^ bVar1;
        bVar5 = (byte)((uint)(int)(char)(bVar15 ^ bVar5) >> 7) & 0x1b ^ (bVar15 ^ bVar5) << 1 ^
                bVar16 ^ bVar5;
        *(byte *)((int)param_2 + 5) = bVar5;
        bVar15 = (byte)((uint)(int)(char)(bVar14 ^ bVar15) >> 7) & 0x1b ^ (bVar14 ^ bVar15) << 1 ^
                 bVar16 ^ bVar15;
        *(byte *)((int)param_2 + 6) = bVar15;
        *(byte *)((int)param_2 + 7) = bVar9 ^ bVar5 ^ bVar15;
        bVar6 = (byte)((uint)(int)(char)(bVar2 ^ bVar6) >> 7) & 0x1b ^ (bVar2 ^ bVar6) << 1 ^ bVar17
                ^ bVar6;
        *(byte *)((int)param_2 + 1) = bVar6;
        bVar1 = *(byte *)((int)param_2 + 0xe);
        bVar2 = (byte)((uint)(int)(char)(bVar12 ^ bVar2) >> 7) & 0x1b ^ (bVar12 ^ bVar2) << 1 ^
                bVar17 ^ bVar2;
        *(byte *)((int)param_2 + 2) = bVar2;
        *(byte *)((int)param_2 + 3) = bVar10 ^ bVar6 ^ bVar2;
        bVar2 = *(byte *)((int)param_2 + 0xf) ^ bVar1;
        bVar2 = (byte)((uint)(int)(char)bVar2 >> 7) & 0x1b ^ bVar2 << 1 ^ bVar25 ^ bVar1;
        *(byte *)((int)param_2 + 0xe) = bVar2;
        bVar3 = (byte)((uint)(int)(char)(bVar1 ^ bVar3) >> 7) & 0x1b ^ (bVar1 ^ bVar3) << 1 ^ bVar25
                ^ bVar3;
        *(byte *)((int)param_2 + 0xd) = bVar3;
        *(byte *)((int)param_2 + 0xf) = bVar7 ^ bVar3 ^ bVar2;
      }
      iVar24 = iVar20 + 0x10;
      uVar21 = *(uint *)((int)param_2 + iVar20 + 0x24) ^ *param_2;
      uVar23 = *(uint *)((int)param_2 + iVar20 + 0x30) ^ param_2[3];
      uVar18 = *(uint *)((int)param_2 + iVar20 + 0x28) ^ param_2[1];
      uVar22 = *(uint *)((int)param_2 + iVar20 + 0x2c) ^ param_2[2];
      *param_2 = uVar21;
      param_2[1] = uVar18;
      param_2[2] = uVar22;
      param_2[3] = uVar23;
      iVar20 = iVar24;
    } while (iVar24 != 0xa0);
    *(byte *)(param_2 + 4) = bVar25;
    param_1[0] = 0;
    param_1[1] = 0;
    param_1[2] = 0;
    param_1[3] = 0;
    param_1[4] = 0;
    param_1[5] = 0;
    param_1[6] = 0;
    param_1[7] = 0;
    param_1[8] = 0;
    param_1[9] = 0;
    param_1[10] = 0;
    param_1[0xb] = 0;
    FUN_0001a430(param_1,0x10,0);
    pbVar19 = *(byte **)(param_1 + 8);
    uVar26 = *(undefined8 *)(param_2 + 2);
    if ((*param_1 & 1) == 0) {
      pbVar19 = param_1 + 1;
    }
    *(undefined8 *)pbVar19 = *(undefined8 *)param_2;
    *(undefined8 *)(pbVar19 + 8) = uVar26;
    return;
  }
  param_1[0] = 0;
  param_1[1] = 0;
  return;
}




// ============================================================
// Function #538
// Name: FUN_0002737c
// Address: 0002737c
// JNI: NO
// ============================================================


void FUN_0002737c(undefined4 param_1,undefined4 *param_2)

{
  byte bVar1;
  byte bVar2;
  byte *pbVar3;
  uint local_38;
  undefined1 auStack_34 [32];
  int local_14;
  
  local_14 = **(int **)(DAT_00027450 + 0x273a4);
  for (local_38 = 0; local_38 < 0x20; local_38 = local_38 + 1) {
    pbVar3 = (byte *)FUN_00027458(param_2[1],local_38);
    bVar1 = *pbVar3;
    pbVar3 = (byte *)FUN_00026f2c(*param_2,local_38 & 7);
    bVar2 = *pbVar3;
    pbVar3 = (byte *)FUN_00027460(auStack_34,local_38);
    *pbVar3 = bVar1 ^ bVar2;
  }
  FUN_00027468(param_1,auStack_34);
  if (**(int **)(DAT_00027454 + 0x27430) == local_14) {
    return;
  }
                    /* WARNING: Subroutine does not return */
  __stack_chk_fail();
}




// ============================================================
// Function #539
// Name: FUN_00027458
// Address: 00027458
// JNI: NO
// ============================================================


int FUN_00027458(int param_1,int param_2)

{
  return param_1 + param_2;
}




// ============================================================
// Function #540
// Name: FUN_00027460
// Address: 00027460
// JNI: NO
// ============================================================


int FUN_00027460(int param_1,int param_2)

{
  return param_1 + param_2;
}




