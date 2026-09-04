/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_0005d100
 * Address  : 0005d100
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_0005d100(int *param_1,int *param_2)

{
  char *pcVar1;
  int iVar2;
  char *pcVar3;
  int iVar4;
  uint uVar5;
  char *pcVar6;
  char *pcVar7;
  uint uVar8;
  
  uVar8 = param_2[2];
  pcVar1 = (char *)FUN_000a0398(uVar8);
  __aeabi_memclr(pcVar1,uVar8);
  if (uVar8 != 0) {
    iVar2 = *param_2;
    iVar4 = param_2[1];
    uVar5 = 0;
    do {
      pcVar1[uVar5] = *(byte *)(iVar2 + (uVar5 & 7)) ^ *(byte *)(iVar4 + uVar5);
      uVar5 = uVar5 + 1;
    } while (uVar8 != uVar5);
  }
  uVar8 = uVar8 - 1;
  if (uVar8 < 0xfffffff8) {
    if (uVar8 < 0xb) {
      pcVar6 = (char *)((int)param_1 + 1);
      *(char *)param_1 = (char)uVar8 * '\x02';
    }
    else {
      pcVar6 = (char *)FUN_000a0370((uVar8 | 7) + 1);
      param_1[2] = (int)pcVar6;
      *param_1 = (uVar8 | 7) + 2;
      param_1[1] = uVar8;
    }
    pcVar3 = pcVar1;
    pcVar7 = pcVar6;
    if (pcVar1 != pcVar1 + uVar8) {
      do {
        uVar8 = uVar8 - 1;
        pcVar6 = pcVar7 + 1;
        *pcVar7 = *pcVar3;
        pcVar3 = pcVar3 + 1;
        pcVar7 = pcVar6;
      } while (uVar8 != 0);
    }
    *pcVar6 = '\0';
    FUN_00023f74(pcVar1);
    return;
  }
                    /* WARNING: Subroutine does not return */
  FUN_00026b08();
}


