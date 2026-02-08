# skill-review-sandbox

Sandbox project for testing [skill-review](https://github.com/decebals/skill-review) end-to-end.

This is a minimal Java project with the skill-review workflow configured. It uses engineering skills from [claude-code-java](https://github.com/decebals/claude-code-java) to review pull requests.

## How to test

1. Add `ANTHROPIC_API_KEY` as a repository secret (Settings > Secrets)
2. Create a branch with Java code changes
3. Open a pull request
4. The skill-review workflow triggers and posts a review comment
