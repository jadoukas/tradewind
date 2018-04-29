package apidemo;

import com.ib.client.ContractCondition;
import com.ib.client.ContractLookuper;

public class ContractConditionPanel<T extends ContractCondition> extends OperatorConditionPanel<T> {
	ContractConditionPanel(T c, ContractLookuper lookuper) {
		super(c);
		
		final ContractCondition condition = m_condition;
		
		add(new ContractLookupButton(condition.conId(), condition.exchange(), lookuper) {
			protected void actionPerformed(int refConId, String refExchId) {
				condition.conId(refConId);
				condition.exchange(refExchId);				
			}  
		});
	}
	
}
