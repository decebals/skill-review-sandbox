# skill-review-sandbox

Sandbox project for testing [skill-review](https://github.com/decebals/skill-review) end-to-end.

This is a minimal Java project with the skill-review workflow configured. It uses engineering skills from [claude-code-java](https://github.com/decebals/claude-code-java) to review pull requests.

## See it in action

[PR #1](https://github.com/decebals/skill-review-sandbox/pull/1) — first end-to-end test:
- [Workflow run](https://github.com/decebals/skill-review-sandbox/actions/runs/21804022997) — the action executed successfully
- [Review comment](https://github.com/decebals/skill-review-sandbox/pull/1#issuecomment-3868054433) — Claude identified two intentional issues using `java-code-review` and `clean-code` skills

## How to test

1. Add `ANTHROPIC_API_KEY` as a repository secret (Settings > Secrets)
2. Create a branch with Java code changes
3. Open a pull request
4. The skill-review workflow triggers and posts a review comment

## Related projects

| Project | Role |
|---------|------|
| [skill-review](https://github.com/decebals/skill-review) | The review mechanism (reusable GitHub Actions workflow) |
| [claude-code-java](https://github.com/decebals/claude-code-java) | The skills (Java engineering standards) |
| **skill-review-sandbox** | This repo — test environment |
