/*
 * Ghidra decompilation
 *
 * Binary   : libpairipcore.so
 * Function : FUN_000241dc
 * Address  : 000241dc
 *
 * WARNING:
 * This is C-like pseudocode generated
 * by Ghidra. It is NOT the original
 * C/C++ source code.
 */


void FUN_000241dc(void)

{
  bool bVar1;
  int *piVar2;
  int iVar3;
  int iVar4;
  int iVar5;
  
  piVar2 = (int *)FUN_0001b414();
  iVar3 = *piVar2;
  if (iVar3 != 0) {
    if ((*(uint *)(iVar3 + 0x28) >> 8 | *(uint *)(iVar3 + 0x2c) << 0x18) != DAT_00024250 ||
        DAT_0002424c != *(uint *)(iVar3 + 0x2c) >> 8) {
      FUN_00024b30((uint *)(iVar3 + 0x28));
      iVar3 = 0;
LAB_0002421e:
      *piVar2 = iVar3;
      return;
    }
    iVar4 = *(int *)(iVar3 + 0x1c);
    if (iVar4 < 0) {
      *(int *)(iVar3 + 0x1c) = iVar4 + 1;
      if (iVar4 == -1) {
        iVar3 = *(int *)(iVar3 + 0x18);
        goto LAB_0002421e;
      }
    }
    else {
      *(int *)(iVar3 + 0x1c) = iVar4 + -1;
      if (iVar4 + -1 == 0) {
        *piVar2 = *(int *)(iVar3 + 0x18);
        if (*(char *)(iVar3 + 0x28) == '\x01') {
          iVar3 = *(int *)(iVar3 + 4);
          FUN_00025804();
          iVar3 = iVar3 + -0x80;
        }
        iVar4 = iVar3 + 0x80;
        if (iVar4 != 0) {
          piVar2 = (int *)(iVar3 + 4);
          DataMemoryBarrier(0x1b);
          do {
            ExclusiveAccess(piVar2);
            iVar5 = *piVar2;
            bVar1 = (bool)hasExclusiveAccess(piVar2);
          } while (!bVar1);
          *piVar2 = iVar5 + -1;
          DataMemoryBarrier(0x1b);
          if (iVar5 == 1) {
            if (*(code **)(iVar3 + 0xc) != (code *)0x0) {
              (**(code **)(iVar3 + 0xc))(iVar4);
            }
            FUN_00024072(iVar4);
            return;
          }
        }
        return;
      }
    }
  }
  return;
}


