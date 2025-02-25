from automata.fa.nfa import NFA
from automata.fa.dfa import DFA

# Step 1: Define the NFA
nfa = NFA(
    states={'q0', 'q1', 'q2'},
    input_symbols={'a', 'b'},
    transitions={
        'q0': {'a': {'q0', 'q1'}},  # q0 goes to q0 and q1 on 'a'
        'q1': {'b': {'q2'}},        # q1 goes to q2 on 'b'
        'q2': {}                    # q2 has no transitions
    },
    initial_state='q0',
    final_states={'q2'}
)

# Step 2: Convert NFA to DFA
dfa = DFA.from_nfa(nfa)

# Step 3: Print DFA transitions
print("DFA States:", dfa.states)
print("DFA Transitions:")
for state, paths in dfa.transitions.items():
    print(f"  {state}: {paths}")

# Step 4: Test DFA
test_strings = ["aab", "ab", "b", "aaab"]
for string in test_strings:
    print(f"String '{string}' is accepted? {dfa.accepts_input(string)}")
