/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_00026f54
 * Address  : 00026f54
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


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


