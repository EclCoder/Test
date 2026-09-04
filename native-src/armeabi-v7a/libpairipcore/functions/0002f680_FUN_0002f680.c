/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0002f680
 * Address  : 0002f680
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


undefined4 FUN_0002f680(int param_1,int *param_2)

{
  int iVar1;
  uint uVar2;
  ulonglong uVar3;
  uint uVar4;
  int iVar5;
  char *pcVar6;
  uint uVar7;
  uint uVar8;
  
  iVar5 = (int)(short)param_2[5];
  uVar7 = 0xcbf29ce4;
  uVar8 = 0x84222325;
  if (iVar5 != 0) {
    pcVar6 = (char *)(param_1 + param_2[4]);
    do {
      uVar3 = (ulonglong)uVar8;
      iVar5 = iVar5 + -1;
      iVar1 = uVar8 * 0x100;
      uVar8 = (uint)(uVar3 * 0x1b3) ^ (int)*pcVar6;
      uVar7 = uVar7 * 0x1b3 + (int)(uVar3 * 0x1b3 >> 0x20) + iVar1 ^ (int)*pcVar6 >> 0x1f;
      pcVar6 = pcVar6 + 1;
    } while (iVar5 != 0);
  }
  uVar4 = *(uint *)(param_1 + *param_2);
  uVar2 = (uVar8 | uVar4) * 2;
  iVar5 = 0x1c;
  if (uVar2 - (uVar8 + uVar4) == param_2[2] &&
      ((uVar7 | (int)uVar4 >> 0x1f) << 1 | (uVar8 | uVar4) >> 0x1f) -
      (uVar7 + ((int)uVar4 >> 0x1f) + (uint)CARRY4(uVar8,uVar4) + (uint)(uVar2 < uVar8 + uVar4)) ==
      param_2[3]) {
    iVar5 = 0x18;
  }
  return *(undefined4 *)((int)param_2 + iVar5);
}


