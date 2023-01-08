package com.driver;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CurrentAccount extends BankAccount {
    String tradeLicenseId;

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        super(name, balance, 5000.0D);
        this.tradeLicenseId = tradeLicenseId;
        if (balance < 5000.0D) {
            throw new Exception("Insufficient Balance");
        }
    }

    public void validateLicenseId() throws Exception {
        boolean isvalid = true;

        for(int i = 0; i < this.tradeLicenseId.length() - 1; ++i) {
            if (this.tradeLicenseId.charAt(i) == this.tradeLicenseId.charAt(i + 1)) {
                isvalid = false;
                break;
            }
        }

        if (!isvalid) {
            Map<Character, Integer> map = new HashMap();

            int maxvalue;
            for(maxvalue = 0; maxvalue < this.tradeLicenseId.length(); ++maxvalue) {
                if (!map.containsKey(this.tradeLicenseId.charAt(maxvalue))) {
                    map.put(this.tradeLicenseId.charAt(maxvalue), 1);
                } else {
                    map.put(this.tradeLicenseId.charAt(maxvalue), (Integer)map.get(this.tradeLicenseId.charAt(maxvalue)) + 1);
                }
            }

            maxvalue = 0;

            Integer i;
            for(Iterator var4 = map.values().iterator(); var4.hasNext(); maxvalue = Math.max(maxvalue, i)) {
                i = (Integer)var4.next();
            }

            if ((double)maxvalue > Math.ceil((double)(this.tradeLicenseId.length() / 2))) {
                throw new Exception("Valid License can not be generated");
            }
        }

    }

    public String getTradeLicenseId() {
        return this.tradeLicenseId;
    }

    public void setTradeLicenseId(String tradeLicenseId) {
        this.tradeLicenseId = tradeLicenseId;
    }
}
